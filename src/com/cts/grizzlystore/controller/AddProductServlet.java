package com.cts.grizzlystore.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
	private String username;
	private String password;

    /**
     * Default constructor. 
     */
    public AddProductServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String id=null;
		String name=null;
		String category=null;
		String description=null;
		float price=0;
		
		
		grizzlyStore gs=new grizzlyStore();
		gs.setId(id);
		gs.setName(name);
		gs.setCategory(category);
		gs.setDescription(description);
		gs.setPrice(price);
		
	}

}
