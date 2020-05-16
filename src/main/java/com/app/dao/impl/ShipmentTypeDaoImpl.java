package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IShipmentTypeDao;
import com.app.model.ShipmentType;
@Repository
public class ShipmentTypeDaoImpl implements IShipmentTypeDao {
   @Autowired
	private HibernateTemplate ht;
	@Override
	public Integer saveShipmentType(ShipmentType st) {
		
		return (Integer)ht.save(st);
	}

	@Override
	public void updateShipmentType(ShipmentType st) {
		ht.update(st);
	}

	@Override
	public void deleteShipmentType(Integer id) {
	    ShipmentType st=new ShipmentType();
	    st.setId(id);
	    ht.delete(st);
	}

	@Override
	public ShipmentType getOneShipmentType(Integer id) {
		return ht.get(ShipmentType.class, id);
		 
	}

	@Override
	public List<ShipmentType> getAllShipmentTypes() {
		
		return ht.loadAll(ShipmentType.class);
	}
    @SuppressWarnings({ "unchecked", "deprecation" })
	@Override
    	public List<Object[]> getShipmentModeAndCount() {
    		String hql=" select shipmentMode,count(shipmentMode) "+" from com.app.model.ShipmentType "+" group by shipmentMode ";
    		return (List<Object[]>)ht.find(hql);

    	}
    	@SuppressWarnings({ "unchecked", "deprecation" })
		@Override
    		public List<Object[]> getShipmentTypeIdAndCode() {
            String hql=" select id,shipmentMode from com.app.model.ShipmentType ";
    			return (List<Object[]>)ht.find(hql);
    		}
}
