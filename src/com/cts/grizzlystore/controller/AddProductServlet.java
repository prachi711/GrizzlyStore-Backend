package com.cts.grizzlystore.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.grizzlystore.bean.grizzlyStore;
import com.cts.grizzlystore.service.AddProductService;
import com.cts.grizzlystore.service.AddProductServiceImpl;


/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    /**
     * Default constructor. 
     */
    public AddProductServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		String id= request.getParameter("productId");
		String name=request.getParameter("productName");
		String category=request.getParameter("category");
		String description=request.getParameter("productDescription");
		float price=Float.parseFloat(request.getParameter("productPrice"));
		
		
		grizzlyStore gs=new grizzlyStore();
		gs.setId(id);
		gs.setName(name);
		gs.setCategory(category);
		gs.setDescription(description);
		gs.setPrice(price);
		
		AddProductService addProductService=AddProductServiceImpl.getInstance();
		addProductService.insertProduct(gs);
		
	}

}
