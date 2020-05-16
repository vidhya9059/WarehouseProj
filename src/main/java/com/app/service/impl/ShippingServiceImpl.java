package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShippingDao;
import com.app.model.Shipping;
import com.app.service.IShippingService;
@Service
public class ShippingServiceImpl implements IShippingService {
@Autowired
	private IShippingDao dao;
	@Transactional
	@Override
	public Integer saveShipping(Shipping shipping) {
		return dao.saveShipping(shipping);
	}
	@Transactional
	@Override
	public void updateShipping(Shipping shipping) {
          dao.updateShipping(shipping);
	}
	@Transactional
	@Override
	public void deleteShipping(Integer id) {
            dao.deleteShipping(id);
            
	}
	@Transactional(readOnly=true)
	@Override
	public Shipping getOneShipping(Integer id) {
		return dao.getOneShipping(id);
	}
	@Transactional(readOnly=true)
	@Override
	public List<Shipping> getAllShippings() {
		return dao.getAllShippings();
	}

}
