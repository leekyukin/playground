package com.playground.hexagonalexample.adapter.out.persistence;

import com.playground.hexagonalexample.application.port.out.LoadAccountPort;
import com.playground.hexagonalexample.application.port.out.SaveAccountPort;
import com.playground.hexagonalexample.domain.BankAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BankAccountRepository implements LoadAccountPort, SaveAccountPort {
    private final BankAccountSpringRepository repository;
    private final BankAccountMapper mapper;

    @Override
    public BankAccount load(Long id) {
        var entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Account Not Found"));
        return mapper.toDomain(entity);
    }

    @Override
    public void save(BankAccount bankAccount) {
        repository.save(mapper.toEntity(bankAccount));
    }
}
