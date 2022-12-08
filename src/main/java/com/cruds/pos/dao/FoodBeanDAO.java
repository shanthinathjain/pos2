package com.cruds.pos.dao;

import java.util.ArrayList;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

public interface FoodBeanDAO {

	public void addFood(FoodBean foodBean);
	
	public FoodBean edit(String foodId);
	
	public boolean modifyFood(FoodBean foodbean)throws POSException;

	public boolean removeFood(String storeId, String foodId);
	
	public FoodBean viewFood(String foodId);
	
	public ArrayList<FoodBean> viewAllFood();
	
	public void changeOrderStatus(String orderId);

	
}
