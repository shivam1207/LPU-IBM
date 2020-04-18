package com.example.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.model.League;

/**
 * Servlet implementation class AddLeagueServlet
 */
public class AddLeagueServlet extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLeagueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
    response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String leagueName=request.getParameter("l_name").toString();
	String leagueYear=request.getParameter("l_year").toString();
	String leagueSeason=request.getParameter("l_season").toString();
	if((leagueName.isEmpty() &&(leagueYear.isEmpty() && (leagueSeason.isEmpty()))))
	{
		RequestDispatcher view=request.getRequestDispatcher("error.html");
		view.forward(request, response);
	}
	else
	{
		RequestDispatcher view=request.getRequestDispatcher("success.html");
		view.forward(request, response);
	}
	
}

}