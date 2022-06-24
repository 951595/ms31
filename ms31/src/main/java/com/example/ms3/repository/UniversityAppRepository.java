package com.example.ms3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms3.entity.UniversityApp;

public interface UniversityAppRepository extends JpaRepository<UniversityApp, Integer>{

	UniversityApp findByName(String name);

}
