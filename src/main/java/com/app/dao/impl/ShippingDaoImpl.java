package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShippingDao;
import com.app.model.Shipping;
@Repository
public class ShippingDaoImpl implements IShippingDao {
   @Autowired
   private HibernateTemplate ht;
	@Override
	public Integer saveShipping(Shipping shipping) {
		return (Integer)ht.save(shipping);
	}

	@Override
	public void updateShipping(Shipping shipping) {
              ht.update(shipping);
              
	}

	@Override
	public void deleteShipping(Integer id) {
		Shipping shipping=new Shipping();
		shipping.setId(id);
		ht.delete(shipping);
     
	}

	@Override
	public Shipping getOneShipping(Integer id) {
		return ht.get(Shipping.class, id);
	}

	@Override
	public List<Shipping> getAllShippings() {
		return ht.loadAll(Shipping.class);
	}

}
