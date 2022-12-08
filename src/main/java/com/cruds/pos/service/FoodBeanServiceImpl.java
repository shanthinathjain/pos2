package com.cruds.pos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.dao.FoodBeanDAO;
import com.cruds.pos.exception.POSException;

@Service
public class FoodBeanServiceImpl implements FoodBeanService {

	@Autowired
	FoodBeanDAO foodBeanDAO;
	
	
	@Override
	public void addFood(FoodBean foodBean) {
		foodBeanDAO.addFood(foodBean);		
	}

	@Override
	public FoodBean edit(String foodId) {
		return foodBeanDAO.edit(foodId);
	}

	@Override
	public boolean modifyFood(FoodBean foodbean) throws POSException {

		return foodBeanDAO.modifyFood(foodbean);
	}

	@Override
	public boolean removeFood(String storeId, String foodId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public FoodBean viewFood(String foodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<FoodBean> viewAllFood() {
		
		return foodBeanDAO.viewAllFood();
	}

	@Override
	public void changeOrderStatus(String orderId) {
		// TODO Auto-generated method stub
		
	}

}
