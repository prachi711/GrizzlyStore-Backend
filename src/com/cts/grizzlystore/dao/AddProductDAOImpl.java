package com.cts.grizzlystore.dao;

import com.cts.employee.dao.LoginDAOImpl;

public class AddProductDAOImpl implements AddProductDAO {
	
	private static AddProductDAOImpl addproductDAOImpl;
	public static AddProductDAOImpl getInstance(){
		if(addproductDAOImpl==null)
		{
			addproductDAOImpl=new AddProductDAOImpl();
			return addproductDAOImpl;
		}
		else
		{
			return addproductDAOImpl;
		}
			
		}
	private AddProductDAOImpl(){}

	public String getproductid(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getcategory(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getname(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String description(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String price(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
