package com.gabiaxel.example

import unfiltered.filter.Plan
import javax.servlet.ServletRequest
import unfiltered.request.GET
import unfiltered.request.Path
import unfiltered.response.Ok
import unfiltered.response.ResponseString
import unfiltered.response.Json
import net.liftweb.json.Extraction.decompose
import argonaut.integrate.unfiltered.JsonResponse

class UnfilteredApp extends Plan {

  def intent = {
    
  	case GET(Path("/unfiltered")) => {
    
  	  val value = Map(
          "language" -> "Scala", 
          "framework" -> "Unfiltered")
      
      JsonResponse(value)
    }
  }
}