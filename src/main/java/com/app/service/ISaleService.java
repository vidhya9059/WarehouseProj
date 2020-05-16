package com.app.service;

import java.util.List;

import com.app.model.Sale;

public interface ISaleService {
	public Integer saveSale(Sale sale);
	public void updateSale(Sale sale);
	public void deleteSale(Integer id);
	public Sale getOneSale(Integer id);
	public List<Sale> getAllSales();


}
