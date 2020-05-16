package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IPartDao;
import com.app.model.Part;
import com.app.service.IPartService;
@Service
public class PartServiceImpl implements IPartService {
	@Autowired
	private IPartDao dao;
	@Transactional

	@Override
	public Integer savePart(Part p) {
		return dao.savePart(p);
	}
	@Transactional
	@Override
	public void updatePart(Part p) {
		dao.updatePart(p);
	}
	@Transactional
	@Override
	public void deletePart(Integer id) {
		dao.deletePart(id);
	}
	@Transactional(readOnly=true)

	@Override
	public Part getOnePart(Integer id) {
		return dao.getOnePart(id);
	}
	@Transactional(readOnly=true)

	@Override
	public List<Part> getAllParts() {
		return dao.getAllParts();
	}
	@Transactional(readOnly=true)

	@Override
	public List<Object[]> getPartAndCount() {
		return dao.getPartAndCount();
	}
	/*@Override
	public List<Object[]> getPartIdAndCodes() {
		return dao.getPartIdAndCodes();
	}
*/
}
