package com.example.stockspring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyDao companyDao;
	
	public Company insertCompany(Company company) throws Exception {
		return companyDao.save(company);
		
	}


	public Company updateCompany(Company company) throws Exception {
		return companyDao.saveAndFlush(company);
	
	}

	public List<Company> getCompanyList() throws Exception {
	
		return companyDao.findAll();
	}

}
