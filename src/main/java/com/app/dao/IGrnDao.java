package com.app.dao;

import java.util.List;

import com.app.model.Grn;


public interface IGrnDao {
	public Integer saveGrn(Grn grn);
	public void updateGrn(Grn grn);
	public void deleteGrn(Integer id);
	public Grn getOneGrn(Integer id);
	public List<Grn> getAllGrns();


}
