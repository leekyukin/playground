package com.playground.hexagonalexample.application.service;

import com.playground.hexagonalexample.application.port.in.DepositUseCase;
import com.playground.hexagonalexample.application.port.in.WithdrawUseCase;
import com.playground.hexagonalexample.application.port.out.LoadAccountPort;
import com.playground.hexagonalexample.application.port.out.SaveAccountPort;
import com.playground.hexagonalexample.domain.BankAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class BankAccountService implements DepositUseCase, WithdrawUseCase {
    private final LoadAccountPort loadAccountPort;
    private final SaveAccountPort saveAccountPort;


    @Override
    public void deposit(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.load(id);
        account.deposit(amount);
        saveAccountPort.save(account);
    }

    @Override
    public boolean withdraw(Long id, BigDecimal amount) {
        BankAccount account = loadAccountPort.load(id);
        boolean hasWithdraw = account.withdraw(amount);
        if (hasWithdraw) {
            saveAccountPort.save(account);
        }
        return hasWithdraw;
    }
}
