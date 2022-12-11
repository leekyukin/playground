package com.playground.hexagonalexample.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountSpringRepository extends JpaRepository<BankAccountEntity, Long> {
}
