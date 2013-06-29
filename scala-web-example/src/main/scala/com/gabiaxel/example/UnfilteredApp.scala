package com.gabiaxel.example

import argonaut.integrate.unfiltered.JsonResponse
import unfiltered.filter.Plan
import unfiltered.request.GET
import unfiltered.request.Path

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