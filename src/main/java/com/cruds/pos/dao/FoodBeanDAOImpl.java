package com.cruds.pos.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.pos.bean.FoodBean;
import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

@Repository
public class FoodBeanDAOImpl implements FoodBeanDAO{

	@Autowired
	SessionFactory sf;

	@Override
	public void addFood(FoodBean foodBean) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(foodBean);
		session.getTransaction().commit();
		session.close();
	}
	
	
public FoodBean edit(String foodId) {
		
		Session session = sf.openSession();
		String hql = "from FoodBean f where f.foodId = ? ";
		
		List<FoodBean> list = session.createQuery(hql).setString(0, foodId).list();
		
		session.close();
		
		if(list.size() > 0)
		{
			return list.get(0);
		}
			
		else 
		{
			return null;
		}
	}

@Override
public boolean modifyFood(FoodBean foodBean) throws POSException {
	Session session = sf.openSession();
	session.beginTransaction();
	session.update(foodBean);
	session.getTransaction().commit();
	session.close();
	return true;
}

	@Override
	public boolean removeFood(String storeId, String foodId) {
		
		Session session = sf.openSession();
		session.beginTransaction();
		
	String hql = "delete from FoodBean f where f.foodId = ?";
		
		FoodBean f = (FoodBean) session.load(FoodBean.class, foodId);
		session.delete(f);	
		session.getTransaction().commit();
		session.close();
		return true;

	}

	@Override
	public FoodBean viewFood(String foodId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<FoodBean> viewAllFood() {
		Session session = sf.openSession();
		@SuppressWarnings("Unchecked")
		ArrayList<FoodBean> list = (ArrayList<FoodBean>) session.createQuery("from FoodBean").list();
		session.close();
		return list;
		}

	@Override
	public void changeOrderStatus(String orderId) {
		// TODO Auto-generated method stub
		
	}
	
}
