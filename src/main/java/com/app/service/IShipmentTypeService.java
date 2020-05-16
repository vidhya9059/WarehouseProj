package com.app.service;

import java.util.List;

import com.app.model.ShipmentType;

public interface IShipmentTypeService {
	public Integer saveShipmentType(ShipmentType st);
	public void updateShipmentType(ShipmentType st);
	public void deleteShipmentType(Integer id);
	public ShipmentType getOneShipmentType(Integer id);
	public List<ShipmentType> getAllShipmentTypes();
	public List<Object[]> getShipmentModeAndCount();
	public List<Object[]> getShipmentTypeIdAndCode();




}
