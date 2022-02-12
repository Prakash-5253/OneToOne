package com.example.demoForOneToOne.repository;

import com.example.demoForOneToOne.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,String> {
}
