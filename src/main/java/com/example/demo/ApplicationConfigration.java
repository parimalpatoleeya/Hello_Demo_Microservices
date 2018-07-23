package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationConfigration {
	@RequestMapping("/demoMethod")
	public String demoMethod(@RequestParam("name") String name)
	{
		return "Hello!!! welcome "+ name;

	}
}
