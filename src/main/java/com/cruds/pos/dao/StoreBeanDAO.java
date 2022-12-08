package com.cruds.pos.dao;

import java.lang.Long;

import java.util.ArrayList;
import java.util.List;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

public interface StoreBeanDAO {

	public void addStore(StoreBean storeBean);
	
	public StoreBean edit(String storeId);
	
	public boolean modifyStore(StoreBean storeBean) throws POSException;
	
	//public int removeStore(Long id);
	
	public StoreBean searchStore(String storeId);
	
	public String viewStore(StoreBean storeBean) ;
	
	//public StoreBean viewStore(StoreBean storeBean);
	
	public ArrayList<StoreBean> viewAllStore();
	
	//public List<StoreBean> viewAllStore();
}
