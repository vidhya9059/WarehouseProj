package com.app.dao;

import java.util.List;

import com.app.model.UomType;

public interface IUomTypeDao {
	public Integer saveUomType(UomType u);
	public void updateUomType(UomType u);
	public void deleteUomType(Integer id);
	public UomType getOneUomType(Integer id);
	public List<UomType> getAllUomTypes();
	public List<Object[]> getUomTypeAndCount();
	public List<Object[]> getUomIdAndModels();
	}
