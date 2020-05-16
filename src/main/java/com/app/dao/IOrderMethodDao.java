package com.app.dao;

import java.util.List;

import com.app.model.OrderMethod;

public interface IOrderMethodDao {
	public Integer saveOrderMethod(OrderMethod omd);
	public void updateOrderMethod(OrderMethod omd);
	public void deleteOrderMethod(Integer id);
	public OrderMethod getOneOrderMethod(Integer id);
	public List<OrderMethod> getAllOrderMethods();
	
	
	public List<Object[]> getOrderIdAndCode(String mode);
	public List<Object[]> getOrderPurcIdAndCode(String purcmode);

}
