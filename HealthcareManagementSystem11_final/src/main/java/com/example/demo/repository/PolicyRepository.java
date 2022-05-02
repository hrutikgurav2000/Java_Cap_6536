package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer>{

}
