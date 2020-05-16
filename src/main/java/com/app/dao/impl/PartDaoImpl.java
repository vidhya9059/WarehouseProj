package com.app.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IPartDao;
import com.app.model.Part;
@Repository
public class PartDaoImpl implements IPartDao {
	@Autowired
	private HibernateTemplate ht;
	@Override
	public Integer savePart(Part p) {
		return (Integer) ht.save(p);
	}

	@Override
	public void updatePart(Part p) {
		ht.update(p);
	}

	@Override
	public void deletePart(Integer id) {
		Part p=new Part();
		p.setId(id);
		ht.delete(p);
	}

	@Override
	public Part getOnePart(Integer id) {
		return ht.get(Part.class, id);
	}

	@Override
	public List<Part> getAllParts() {
		return ht.loadAll(Part.class);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Object[]> getPartAndCount() {
		String hql=" select uom,count(uom) "+" from com.app.model.Part "+" group by uom ";


		return (List<Object[]>)ht.find(hql);
	}
    
	/*
    @Override
    public List<Object[]> getPartIdAndCodes() {
   	DetachedCriteria dc=DetachedCriteria.forClass(Part.class).setProjection(Projections.projectionList().add(Projections.property("id")).add(Projections.property("code")));
    @SuppressWarnings("unchecked")
	List<Object[]> list=(List<Object[]>)ht.findByCriteria(dc);
 	return list;
    }
    */

}
