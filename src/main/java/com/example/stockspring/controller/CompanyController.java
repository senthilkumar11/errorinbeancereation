package com.example.stockspring.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.StockPrice;
import com.example.stockspring.service.CompanyService;

@RestController
public class CompanyController {
	@Autowired
	CompanyService companyService;
	
	@GetMapping(value="/create")
	public int insertCompany() throws Exception
	{Date date=new Date();
		StockPrice sp1=new StockPrice(1,"bsc",121,date,date);
		StockPrice sp2=new StockPrice(1,"bsc",121,date,date);
		List<StockPrice> list = null;
		list.add(sp2);
		list.add(sp1);
		BigDecimal bd=new BigDecimal(1675176);
		Company company=new Company("cts",bd,"brain","brai",1,"ajgsdghasj",0,list);
		companyService.insertCompany(company);
		return 0;
	}
}
