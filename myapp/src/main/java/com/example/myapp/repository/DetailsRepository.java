package com.example.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myapp.entity.Details;

public interface DetailsRepository extends JpaRepository<Details,Integer> {

}
