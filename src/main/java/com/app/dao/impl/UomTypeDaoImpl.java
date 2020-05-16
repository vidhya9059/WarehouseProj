package com.app.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUomTypeDao;
import com.app.model.UomType;
@Repository
public class UomTypeDaoImpl implements IUomTypeDao {
    @Autowired
    private HibernateTemplate ht;
	@Override
	public Integer saveUomType(UomType u) {
		return (Integer)ht.save(u);
	}
	@Override
	public void updateUomType(UomType u) {
         ht.update(u);
	}
	@Override
	public void deleteUomType(Integer id) {
		UomType u=new UomType();
		u.setId(id);
		ht.delete(u);
	}
	@Override
	public UomType getOneUomType(Integer id) {
		 UomType u=ht.get(UomType.class, id);
		return u;
	}
	@Override
	public List<UomType> getAllUomTypes() {
		List<UomType> lu=ht.loadAll(UomType.class);
		return lu;
	}
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Object[]> getUomTypeAndCount() {
		String hql=" select uomtype,count(uomtype) "+" from com.app.model.UomType "+" group by uomtype ";
		return (List<Object[]>)ht.find(hql);
	}
     @SuppressWarnings({ "unchecked", "deprecation" })
	@Override
    public List<Object[]> getUomIdAndModels() {
    	String hql=" select id,uommodel "+" from com.app.model.UomType ";
    	return (List<Object[]>) ht.find(hql);
    }
	/*@Override
	public List<Object[]> getUomIdAndModels() {
		DetachedCriteria dc=DetachedCriteria.forClass(UomType.class)
				.setProjection(Projections.projectionList()
						.add(Projections.property("id"))
						.add(Projections.property("uommodel")));
		@SuppressWarnings("unchecked")
		List<Object> list=(List<Object>) ht.findByCriteria(dc);
		
		
		return list;
	}
	*/
}
