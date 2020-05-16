package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ISaleDao;
import com.app.model.Sale;
import com.app.service.ISaleService;
@Service
public class SaleServiceImpl implements ISaleService {
	@Autowired
	private ISaleDao dao;

	@Transactional 
	@Override
	public Integer saveSale(Sale sale) {
		return dao.saveSale(sale);
	}
	@Transactional 
	@Override
	public void updateSale(Sale sale) {
		dao.updateSale(sale);
	}

	@Transactional 
	@Override
	public void deleteSale(Integer id) {
		dao.deleteSale(id);
	}

	@Transactional(readOnly=true)
	@Override
	public Sale getOneSale(Integer id) {
		return dao.getOneSale(id);
	}

	@Transactional (readOnly=true)
	@Override
	public List<Sale> getAllSales() {
		return dao.getAllSales();
	}

}
