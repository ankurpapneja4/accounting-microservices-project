package com.github.ankurpapneja4.bookkeeper.accountservice.repository;

import com.github.ankurpapneja4.bookkeeper.accountservice.domain.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
