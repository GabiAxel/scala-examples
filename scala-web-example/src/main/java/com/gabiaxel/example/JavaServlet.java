package com.gabiaxel.example;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;


@WebServlet("/java")
public class JavaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json");
		
		Map<String, ?> value = ImmutableMap.of(
			"language", "Java",
			"framework", "Servlet");
		
		ObjectMapper mapper = new ObjectMapper();
	
		mapper.writeValue(response.getOutputStream(), value);
	}

}
