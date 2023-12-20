package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.QueryEntity;

public interface queryRepository extends JpaRepository<QueryEntity, Long>{

}
