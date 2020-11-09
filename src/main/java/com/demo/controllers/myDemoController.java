package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class myDemoController 
{
	private String[] quotes= {"To be or not to be - shakespeare","Spring in natures way of saying Let's Party",
			"The time is alwyas right to do what is right"};
	//@RequestMapping(value="/getQuote",params="from=Andy")
	//@RequestMapping(value="/getQuote",headers="X-API-KEY=7654321")
	@RequestMapping(value="/getQuote")
	public String  getRandomQuote(@RequestParam("userName") String userName,Model model)
	{
		System.out.println("URL successfully mapped");
		int rand=new Random().nextInt(quotes.length);
		String randomQuote=quotes[rand];
		model.addAttribute("randomQuote",randomQuote);
		System.out.println("User Name is:"+userName);
		model.addAttribute("userName",userName);
		return "quote";
	}
	
	
	
}