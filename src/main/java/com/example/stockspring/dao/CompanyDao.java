package com.example.stockspring.dao;


import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;

@Repository
public interface CompanyDao extends JpaRepository<Company, Integer>{
	
}
