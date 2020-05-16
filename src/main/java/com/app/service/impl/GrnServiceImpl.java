package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IGrnDao;
import com.app.model.Grn;
import com.app.service.IGrnService;
@Service
public class GrnServiceImpl implements IGrnService {
	@Autowired
	private IGrnDao dao;
	@Transactional
	@Override
	public Integer saveGrn(Grn grn) {
		return dao.saveGrn(grn);
	}
	@Transactional
	@Override
	public void updateGrn(Grn grn) {
		dao.updateGrn(grn);
	}
	@Transactional
	@Override
	public void deleteGrn(Integer id) {
		dao.deleteGrn(id);
	}
	@Transactional(readOnly=true)
	@Override
	public Grn getOneGrn(Integer id) {
		return dao.getOneGrn(id);
	}
	@Transactional(readOnly=true)
	@Override
	public List<Grn> getAllGrns() {
		return dao.getAllGrns();
	}

}
