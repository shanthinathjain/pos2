package com.cruds.pos.service;

import java.util.ArrayList;
import java.util.List;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.exception.POSException;

public interface StoreBeanService {
	
	public void addStore(StoreBean storeBean);
	
	public StoreBean edit(String storeId);
	
	public boolean modifyStore(StoreBean storeBean) throws POSException;
	
	//public int removeStore(ArrayList<String> storeId);
	
	public StoreBean searchStore(String storeId);
	
	public String viewStore(StoreBean storeBean);
	
	//public boolean searchStore(StoreBean storeBean) throws POSException;
	
	public ArrayList<StoreBean> viewAllStore();
}
