package com.cruds.pos.dao;

import java.sql.SQLException;
 import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.Log;
import org.hibernate.annotations.common.util.impl.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;
import com.cruds.pos.service.StoreBeanService;
import com.cruds.pos.service.StoreBeanServiceImpl;

@Repository
public class StoreBeanDAOImpl implements StoreBeanDAO {

	@Autowired
	SessionFactory sf;

	@Override
	public void addStore(StoreBean storeBean) {

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(storeBean);
		session.getTransaction().commit();
		session.close();

	}

	public StoreBean edit(String storeId) {

		Session session = sf.openSession();
		String hql = "from StoreBean s where s.storeId = ? ";

		List<StoreBean> list = session.createQuery(hql).setString(0, storeId).list();

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

	public boolean modifyStore(StoreBean storeBean) throws POSException {

		Session session = sf.openSession();
		session.beginTransaction();
		session.update(storeBean);
		session.getTransaction().commit();
		session.close();
		return true;
	}


	public StoreBean searchStore(String storeId) {

		Session session = sf.openSession();
		String hql = "from StoreBean s where s.storeId = ? ";

		List<StoreBean> list = session.createQuery(hql).setString(0, storeId).list();

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

	public String viewStore(StoreBean storeBean)
	{
		Session session = sf.openSession();
		//session.beginTransaction();
		String store = (String) session.load(StoreBean.class, storeBean);
		//Hibernate.initialize(store.getStoreId());
		//String storeBean = store.getStoreId();
		session.close();
		return store;
	}

	/*public String viewStore(String storeId)
    {
       Session session = sf.openSession();
       StoreBean storeBean = (StoreBean) session.load(StoreBean.class, storeId);
       Hibernate.initialize(storeBean.getStoreId());
       session.getTransaction().commit();
       return storeBean.getStoreId();
    }*/
	
	
		@Override
		public ArrayList<StoreBean> viewAllStore() {
		Session session = sf.openSession();
		@SuppressWarnings("Unchecked")
		ArrayList<StoreBean> list = (ArrayList<StoreBean>) session.createQuery("from StoreBean").list();
		session.close();
		return list;
	}

	 
}
