package com.dhanubuilding.Repository;

import com.dhanubuilding.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}