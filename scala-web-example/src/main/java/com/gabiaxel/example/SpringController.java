package com.gabiaxel.example;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.ImmutableMap;

@Controller
@RequestMapping
public class SpringController {

	@ResponseBody
	@RequestMapping(value="/spring", method=GET)
	public Object getValue() {

		return ImmutableMap.of(
			"language", "Java",
			"framework", "Spring MVC");
	}
}
