package com.app.service;

import java.util.List;

import com.app.model.Shipping;

public interface IShippingService {
	public Integer saveShipping(Shipping shipping);
	public void updateShipping(Shipping shipping);
	public void deleteShipping(Integer id);
	public Shipping getOneShipping(Integer id);
	public List<Shipping> getAllShippings();
    



}
