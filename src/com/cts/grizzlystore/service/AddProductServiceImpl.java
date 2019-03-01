package com.cts.grizzlystore.service;


import com.cts.grizzlystore.bean.grizzlyStore;
import com.cts.grizzlystore.dao.AddProductDAO;
import com.cts.grizzlystore.dao.AddProductDAOImpl;


public class AddProductServiceImpl implements AddProductService {
	
	private static AddProductServiceImpl addProductServiceImpl;
	
	private AddProductDAO dao=AddProductDAOImpl.getInstance();
	public static AddProductServiceImpl getInstance(){
		if(addProductServiceImpl==null)
		{
			addProductServiceImpl=new AddProductServiceImpl();
			return addProductServiceImpl;
		}
		else
		{
			return addProductServiceImpl;
		}
			
		}
	private AddProductServiceImpl(){}

	public String insertProduct(grizzlyStore gs) {
		// TODO Auto-generated method stub
		return dao.insertProduct(gs);
	}
	
		

}
