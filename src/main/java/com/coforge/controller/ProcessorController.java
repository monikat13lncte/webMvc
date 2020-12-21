package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.entity.Processor;
import com.coforge.service.LaptopService;


@Controller
@RequestMapping(value="/")
public class ProcessorController {
	
	@Autowired
	LaptopService laptopservice;
	
	@RequestMapping(value="/addprocessor",method=RequestMethod.GET)
	
	public ModelAndView Processor(@ModelAttribute("processor")Processor p, BindingResult result)
	{
		
		ModelAndView mv= new ModelAndView("addprocessor");
		mv.addObject("addprocessor",p);
		return mv;	
	}
	
	
	@RequestMapping(value="/addprocessor")
	public void save(@ModelAttribute("processor")Processor processor)
	{
		
		laptopservice.addProcessor(processor);
	}
	
	@RequestMapping(value="/updateprocessor",method=RequestMethod.GET)
	public ModelAndView update(@ModelAttribute("processor")Processor processor)
	{

		ModelAndView mv= new ModelAndView("updateprocessor");
		mv.addObject("updateprocessor",processor);
		
		return mv;
		
		
	}
	@RequestMapping(value="/updateprocessor")
	public void saveupdate(@ModelAttribute("processor")Processor processor)
	{
		laptopservice.editProcessor(processor, processor.getId());
		
	}
	@RequestMapping(value="/deleteprocessor",method=RequestMethod.GET)
	public ModelAndView delete(@ModelAttribute("deleteprocessor")Processor laptop)
	{
	
		ModelAndView mv= new ModelAndView("deleteprocessor");
		mv.addObject("deleteprocessor",laptop);
		
		return mv;
	}
	@RequestMapping(value="/deleteprocessor")
	public void savedelete(@ModelAttribute("deleteprocessor")Processor laptop)
	{
		laptopservice.deleteLaptop(laptop.getId());
		
	}
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public ModelAndView find(@ModelAttribute("find")Processor emp)
	{
		
		ModelAndView mv= new ModelAndView("find");
		mv.addObject("find",emp);
		
		return mv;
		
		
	}
	@RequestMapping(value="/find")
	public String FindData(@ModelAttribute("find")Processor p,Model model, BindingResult result) 
	{
	
		Processor l1= laptopservice.find(p.getId());
	
		model.addAttribute("processor",l1);		
		
		return "see";
}
	
	@RequestMapping(value="findallprocessor",method=RequestMethod.GET)
	public String SeeData(Model model, Processor p, BindingResult result) 
	{
	
		List<Processor> l1= laptopservice.findAll();
	
		
		model.addAttribute("list",l1);
		return "findallprocessor";

}

	
}