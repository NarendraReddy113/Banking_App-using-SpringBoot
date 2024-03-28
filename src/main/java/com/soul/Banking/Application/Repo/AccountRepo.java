package com.soul.Banking.Application.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soul.Banking.Application.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long>{

}
