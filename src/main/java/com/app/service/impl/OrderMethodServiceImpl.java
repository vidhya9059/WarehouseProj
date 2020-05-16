package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;
import com.app.service.IOrderMethodService;
@Service
public class OrderMethodServiceImpl implements IOrderMethodService {
	@Autowired
	private IOrderMethodDao dao;
	@Transactional
	@Override
	public Integer saveOrderMethod(OrderMethod omd) {

		return dao.saveOrderMethod(omd);
	}
	@Transactional
	@Override
	public void updateOrderMethod(OrderMethod omd) {
		dao.updateOrderMethod(omd);

	}
	@Transactional
	@Override
	public void deleteOrderMethod(Integer id) {
		dao.deleteOrderMethod(id);

	}
	@Transactional(readOnly=true)
	@Override
	public OrderMethod getOneOrderMethod(Integer id) {

		return dao.getOneOrderMethod(id);
	}
	@Transactional(readOnly=true)
	@Override
	public List<OrderMethod> getAllOrderMethods() {

		return dao.getAllOrderMethods();
	}
	@Override
	public List<Object[]> getOrderIdAndCode(String mode) {
		return dao.getOrderIdAndCode(mode);
	}
	@Override
	public List<Object[]> getOrderPurcIdAndCode(String purcmode) {
		return dao.getOrderPurcIdAndCode(purcmode);
	}

}
