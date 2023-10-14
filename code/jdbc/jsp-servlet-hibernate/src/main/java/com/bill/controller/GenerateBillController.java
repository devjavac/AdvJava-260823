package com.bill.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bill.entity.BillEntity;
import com.bill.model.BillModel;

@WebServlet("/generate-bill")
public class GenerateBillController extends HttpServlet {
	public static final double perUnitPrice = 7.1;
	public static final double tax = 10;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String city = request.getParameter("city");
		int unit = Integer.parseInt(request.getParameter("unit"));
		String duedate = request.getParameter("duedate");
		double amount = perUnitPrice * unit;
		double payAmount = amount + ((amount*tax)/100);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dt = LocalDate.parse(duedate, dtf);
		
		BillEntity bill = new BillEntity();
		bill.setUsername(name);
		bill.setCity(city);
		bill.setAmount(amount);
		bill.setPayamt(payAmount);
		bill.setUnitconsume(unit);
		bill.setDuedate(dt);
		
		BillModel model = new BillModel();
		model.saveBill(bill);
		
		response.sendRedirect("light-bill.jsp");
	}
}
