package com.cruds.pos.service;

import java.lang.Long;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.pos.bean.StoreBean;
import com.cruds.pos.dao.StoreBeanDAO;
import com.cruds.pos.exception.POSException;

@Service
public class StoreBeanServiceImpl implements StoreBeanService{
	
	@Autowired
	StoreBeanDAO storeBeanDAO;

	@Override
	public void addStore(StoreBean storeBean) {
		storeBeanDAO.addStore(storeBean);
	}

	@Override 
	public boolean modifyStore(StoreBean storeBean) throws POSException {
		return storeBeanDAO.modifyStore(storeBean);
	}

	/*@Override
	public int removeStore(Long id) {
		return storeBeanDAO.removeStore(id);
	}
	*/
	
	/*public void removeStore(String storeId) {
		
		 storeBeanDAO.removeStore(storeId);;
	}*/

	
	public StoreBean searchStore(String storeId) {	
		return storeBeanDAO.searchStore(storeId);
	}
	
	
	@Override
	public String viewStore(StoreBean storeBean) {		
		return storeBeanDAO.viewStore(storeBean);
	}

	@Override
	public ArrayList<StoreBean> viewAllStore() {
		return storeBeanDAO.viewAllStore() ;
	}

	@Override
	public StoreBean edit(String storeId) {
		return storeBeanDAO.edit(storeId);
	}

	
}
