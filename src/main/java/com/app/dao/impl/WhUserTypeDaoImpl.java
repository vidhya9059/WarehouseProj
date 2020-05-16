package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IWhUserTypeDao;
import com.app.model.WhUserType;
@Repository
public class WhUserTypeDaoImpl implements IWhUserTypeDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public Integer saveWhUserType(WhUserType wut) {
		return (Integer)ht.save(wut);
	}

	@Override
	public void updateWhUserType(WhUserType wut) {
            ht.update(wut);
	}

	@Override
	public void deleteWhUserType(Integer id) {
		WhUserType wut=new WhUserType();
		wut.setId(id);
       ht.delete(wut);
	}

	@Override
	public WhUserType getOneWhUserType(Integer id) {
		return ht.get(WhUserType.class, id);
	}

	@Override
	public List<WhUserType> getAllWhUserTypes() {
		return ht.loadAll(WhUserType.class);
	}
@Override
public List<Object[]> getWhUserTypeIdAndCode(String whUserType) {
     String hql=" select id,userCode "+" from com.app.model.WhUserType "+" where userType=?0 ";
            @SuppressWarnings({ "unchecked", "deprecation" })
			List<Object[]> arr=(List<Object[]>)	ht.find(hql, whUserType);
	
	return arr;
}
}
