package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IWhUserTypeDao;
import com.app.model.WhUserType;
import com.app.service.IWhUserTypeService;
@Service
public class WhUserTypeServiceImpl implements IWhUserTypeService {
    @Autowired
	private IWhUserTypeDao dao;
    @Transactional
	@Override
	public Integer saveWhUserType(WhUserType wut) {
		return dao.saveWhUserType(wut);
	}
    @Transactional
	@Override
	public void updateWhUserType(WhUserType wut) {
       dao.updateWhUserType(wut);
	}
    @Transactional
	@Override
	public void deleteWhUserType(Integer id) {
   dao.deleteWhUserType(id);
	}
    @Transactional(readOnly=true)
	@Override
	public WhUserType getOneWhUserType(Integer id) {
		return dao.getOneWhUserType(id);
	}
    @Transactional(readOnly=true)
	@Override
	public List<WhUserType> getAllWhUserTypes() {
		return dao.getAllWhUserTypes();
	}
    @Transactional(readOnly=true)
    @Override
    public List<Object[]> getWhUserTypeIdAndCode(String whUserType) {
    	return dao.getWhUserTypeIdAndCode(whUserType);
    }

}
