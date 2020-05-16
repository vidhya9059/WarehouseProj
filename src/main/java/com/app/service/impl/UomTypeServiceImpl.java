package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUomTypeDao;
import com.app.model.UomType;
import com.app.service.IUomTypeService;
@Service

public class UomTypeServiceImpl implements IUomTypeService {
	@Autowired
	private IUomTypeDao dao;

	@Transactional
	public Integer saveUomType(UomType u) {
		

		return dao.saveUomType(u);
	}
	@Transactional
	@Override
	public void updateUomType(UomType u) {
        dao.updateUomType(u);
	}
	@Transactional
	@Override
	public void deleteUomType(Integer id) {
   dao.deleteUomType(id);
	}
	@Transactional(readOnly=true)
	@Override
	public UomType getOneUomType(Integer id) {
		return dao.getOneUomType(id);
	}
	@Transactional(readOnly=true)
	@Override
	public List<UomType> getAllUomTypes() {
		// TODO Auto-generated method stub
		return dao.getAllUomTypes();
	}
	@Transactional(readOnly=true)

	@Override
	public List<Object[]> getUomTypeAndCount() {
		return dao.getUomTypeAndCount();
	}
	@Transactional(readOnly=true)
    @Override
    public List<Object[]> getUomIdAndModels() {
    	return dao.getUomIdAndModels();
    }
}
