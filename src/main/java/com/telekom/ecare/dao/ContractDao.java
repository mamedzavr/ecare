package com.telekom.ecare.dao;

import com.telekom.ecare.domain.Client;
import com.telekom.ecare.domain.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ContractDao extends JpaRepository<Contract, Long> {
    public Set<Contract> findContractsByClient_Id(Long id);
}
