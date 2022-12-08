package com.cruds.pos.service;

import java.util.ArrayList;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.exception.POSException;

public interface FoodBeanService {

	public void addFood(FoodBean foodBean);
	
	public FoodBean edit(String foodId);
	
	public boolean modifyFood(FoodBean foodbean) throws POSException;

	public boolean removeFood(String storeId, String foodId);
	
	public FoodBean viewFood(String foodId);
	
	public ArrayList<FoodBean> viewAllFood();
	
	public void changeOrderStatus(String orderId);
		
}
