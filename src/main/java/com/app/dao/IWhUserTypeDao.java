package com.app.dao;

import java.util.List;

import com.app.model.WhUserType;

public interface IWhUserTypeDao {
	public Integer saveWhUserType(WhUserType wut);
	public void updateWhUserType(WhUserType wut);
	public void deleteWhUserType(Integer id);
	public WhUserType getOneWhUserType(Integer id);
	public List<WhUserType> getAllWhUserTypes();
    public List<Object[]> getWhUserTypeIdAndCode(String whUserType);
}
