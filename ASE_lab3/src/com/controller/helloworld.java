package com.controller;

/**
 * This java controller controls the flow of the program from front end(jsp view pages) to the VO file.
 */
import java.util.ArrayList;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import antlr.collections.List;

import com.mysql.fabric.Response;
import com.sun.jersey.api.core.HttpResponseContext;
import com.vo.regVo;

@Controller
public class helloworld {
		
	@RequestMapping(value="signup1.htm",method=RequestMethod.GET)
	public ModelAndView loadsignup1()
	{
		return new ModelAndView("signup1_Vo_obj","x",new regVo());
	}
	
	@RequestMapping(value="signin1.htm",method=RequestMethod.POST)
	public ModelAndView loadsignin1(@ModelAttribute regVo r,HttpSession s,HttpServletRequest rq)
	{
		s=rq.getSession();
		s.setAttribute("reg",r);
		return new ModelAndView("signin1_Vo_obj","y",new regVo());
	}
	
	@RequestMapping(value="verify1.htm",method=RequestMethod.POST)
	public ModelAndView verify1(@ModelAttribute regVo r,HttpSession s,HttpServletRequest rq)
	{
		s=rq.getSession();
		regVo r2=(regVo) s.getAttribute("reg");
		if((r2.getUs()).equals(r.getUs1()) && (r2.getPw()).equals(r.getPw1()))
		{
			return new ModelAndView("welcome","x1",r2.getFn()).addObject("y1",r2.getLn());
		}
		else
		{
			return new ModelAndView("signin1_Vo_obj","y",new regVo());
		}
	}
}
