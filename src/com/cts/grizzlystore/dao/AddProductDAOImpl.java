package com.cts.grizzlystore.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cts.grizzlystore.util.*;


import com.cts.grizzlystore.bean.grizzlyStore;

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
	
	public String insertProduct(grizzlyStore gs)
	{
		String query="insert into product(productid,category,name,description,price) values (?,?,?,?,?)";
		Connection connection=null;
		PreparedStatement preparedstatement=null;
		
		connection =DBUtils.getConnection();
		
		try {
			
			preparedstatement=connection.prepareStatement(query);
			 preparedstatement.setString(1, gs.getId());
			 preparedstatement.setString(2,gs.getCategory());
			 preparedstatement.setString(3,gs.getName());
			 preparedstatement.setString(4, gs.getDescription());
			 preparedstatement.setFloat(5, gs.getPrice());
			 
			int result=preparedstatement.executeUpdate();
			System.out.println(result);
			connection.commit();
			return "success";
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		try {
			connection.rollback();
			
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		}
		return null;
	}

	

}
