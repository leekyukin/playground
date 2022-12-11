package com.playground.hexagonalexample.adapter.out.persistence;

import com.playground.hexagonalexample.domain.BankAccount;

public class BankAccountMapper {

    public BankAccount toDomain(BankAccountEntity entity) {
        return BankAccount.builder()
            .id(entity.getId())
            .balance(entity.getBalance())
            .build();
    }

    public BankAccountEntity toEntity(BankAccount bankAccount) {
        return BankAccountEntity.builder()
            .id(bankAccount.getId())
            .balance(bankAccount.getBalance())
            .build();
    }
}
