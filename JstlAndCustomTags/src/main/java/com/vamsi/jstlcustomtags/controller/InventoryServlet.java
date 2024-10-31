package com.vamsi.jstlcustomtags.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.vamsi.jstlcustomtags.models.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InventoryServlet
 */

public class InventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InventoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> sampleProducts = new ArrayList<>();
		sampleProducts.add(new Product(1, "Google Pixel 8 Pro", 10, 999.99));
		sampleProducts.add(new Product(2, "Microsoft Surface Laptop 5", 15, 1299.99));
		sampleProducts.add(new Product(3, "Bose QuietComfort 45", 20, 329.99));
		sampleProducts.add(new Product(4, "Lenovo ThinkPad X1 Carbon", 12, 1499.99));
		sampleProducts.add(new Product(5, "Apple Watch Series 9", 25, 399.99));
		sampleProducts.add(new Product(6, "Amazon Echo Show 10", 18, 249.99));


        request.setAttribute("productList", sampleProducts);
        request.getRequestDispatcher("inventory.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
