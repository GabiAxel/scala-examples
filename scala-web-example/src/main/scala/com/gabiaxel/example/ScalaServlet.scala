package com.gabiaxel.example

import com.fasterxml.jackson.databind.ObjectMapper
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import com.fasterxml.jackson.module.scala.DefaultScalaModule

@WebServlet(Array("/scala"))
class ScalaServlet extends HttpServlet {

  override def doGet(request: HttpServletRequest, response: HttpServletResponse) = {
	
    response setContentType "application/json"
    
    val value = Map(
        "language" -> "Scala", 
        "framework" -> "Servlet")
    
    val mapper = new ObjectMapper().registerModule(DefaultScalaModule)
    
    mapper.writeValue(response.getOutputStream, value)
  }

}