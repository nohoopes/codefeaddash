package codefe.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import codefe.admin.model.*;
import codefe.admin.data.*;

/**
 * Servlet implementation class HomeController
 */
public class BillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BillDAO bDao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillController() {
        bDao = new BillDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Bill> listBill = new ArrayList<Bill>();
		listBill = bDao.listAllBill();
        request.setAttribute("listBill", listBill);
        RequestDispatcher dispatcher = request.getRequestDispatcher("analytic/analytic.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}