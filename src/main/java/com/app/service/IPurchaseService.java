package com.app.service;

import java.util.List;

import com.app.model.Purchase;

public interface IPurchaseService {
	public Integer savePurchase(Purchase p);
	public void updatePurchase(Purchase p);
	public void deletePurchase(Integer id);
	public Purchase getOnePurchase(Integer id);
	public List<Purchase> getAllPurchases();


}
