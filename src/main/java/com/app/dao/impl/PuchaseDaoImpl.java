package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IPurchaseDao;
import com.app.model.Purchase;
@Repository
public class PuchaseDaoImpl implements IPurchaseDao {
	@Autowired
	private HibernateTemplate ht;


	@Override
	public Integer savePurchase(Purchase p) {
		return (Integer)ht.save(p);
	}

	@Override
	public void updatePurchase(Purchase p) {
		ht.update(p);
	}

	@Override
	public void deletePurchase(Integer id) {
		Purchase p=new Purchase();
		p.setId(id);
		ht.delete(p);
	}

	@Override
	public Purchase getOnePurchase(Integer id) {
		return ht.get(Purchase.class, id);
	}

	@Override
	public List<Purchase> getAllPurchases() {
		return ht.loadAll(Purchase.class);
	}

}
