package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IOrderMethodDao;
import com.app.model.OrderMethod;
@Repository
public class OrderMethodDaoImpl implements IOrderMethodDao {
     @Autowired
     private HibernateTemplate ht;
	@Override
	public Integer saveOrderMethod(OrderMethod omd) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(omd);
	}

	@Override
	public void updateOrderMethod(OrderMethod omd) {
		ht.update(omd);

	}

	@Override
	public void deleteOrderMethod(Integer id) {
		OrderMethod omd=new OrderMethod();
			omd.setId(id);
       ht.delete(omd);
	}

	@Override
	public OrderMethod getOneOrderMethod(Integer id) {
		return ht.get(OrderMethod.class,id);
	}

	@Override
	public List<OrderMethod> getAllOrderMethods() {
		
		return ht.loadAll(OrderMethod.class);
		
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Object[]> getOrderIdAndCode(String mode) {
		String hql=" select id,orderCode "+" from com.app.model.OrderMethod "+" where orderMode=?0 ";
		return (List<Object[]>) ht.find(hql, mode);
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Object[]> getOrderPurcIdAndCode(String purcmode) {
		String hql=" select id,orderCode "+" from com.app.model.OrderMethod "+" where orderMode=?1 ";
		return (List<Object[]>) ht.find(hql, purcmode);
	
	}

}
