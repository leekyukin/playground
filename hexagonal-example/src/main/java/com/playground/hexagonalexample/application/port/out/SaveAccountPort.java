package com.playground.hexagonalexample.application.port.out;

import com.playground.hexagonalexample.domain.BankAccount;

public interface SaveAccountPort {
    void save(BankAccount bankAccount);
}
