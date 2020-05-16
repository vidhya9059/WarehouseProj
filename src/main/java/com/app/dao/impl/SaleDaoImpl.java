package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ISaleDao;
import com.app.model.Sale;
@Repository
public class SaleDaoImpl implements ISaleDao {
@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveSale(Sale sale) {
		
		return (Integer) ht.save(sale);
	}

	@Override
	public void updateSale(Sale sale) {
   ht.update(sale);
	}

	@Override
	public void deleteSale(Integer id) {
	Sale sale=new Sale();
	sale.setId(id);
      ht.delete(sale);
	}

	public Sale getOneSale(Integer id) {
		return ht.get(Sale.class, id);
	}

	@Override
	public List<Sale> getAllSales() {
		return ht.loadAll(Sale.class);
	}
/*
	@Override
	public List<Object[]> getSalesAndCount() {
		String hql=" select "
		return null;
	}
*/
}
