package com.playground.hexagonalexample.application.port.out;

import com.playground.hexagonalexample.domain.BankAccount;

public interface LoadAccountPort {
    BankAccount load(Long id);
}
