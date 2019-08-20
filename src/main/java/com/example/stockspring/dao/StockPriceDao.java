package com.example.stockspring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.StockPrice;


@Repository
public interface StockPriceDao extends JpaRepository<StockPrice, Integer> {
	
   
}
