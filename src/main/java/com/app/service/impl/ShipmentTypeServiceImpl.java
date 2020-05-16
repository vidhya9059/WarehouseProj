package com.app.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;
@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {
	@Autowired
	private IShipmentTypeDao dao;
	@Override
	@Transactional
	public Integer saveShipmentType(ShipmentType st) {
		return dao.saveShipmentType(st);
	}
	@Transactional
	@Override
	public void updateShipmentType(ShipmentType st) {
		dao.updateShipmentType(st);

	}
	@Transactional
	@Override
	public void deleteShipmentType(Integer id) {
		dao.deleteShipmentType(id);
		

	}
	@Transactional(readOnly=true)
	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		return dao.getOneShipmentType(id);
	}
	@Transactional(readOnly=true)
	@Override
	public List<ShipmentType> getAllShipmentTypes() {

		return dao.getAllShipmentTypes();
	}
	@Transactional(readOnly=true)
	@Override
	public List<Object[]> getShipmentModeAndCount() {
		return dao.getShipmentModeAndCount();
	}
	@Transactional(readOnly=true)
   @Override
   	public List<Object[]> getShipmentTypeIdAndCode() {
   		
   		return dao.getShipmentTypeIdAndCode();
   	}	

}
