package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.entity.Laptop;
import com.coforge.entity.Processor;
import com.coforge.service.LaptopService;




  @Controller
  
  @RequestMapping(value="/") public class LaptopController {
  
  @Autowired LaptopService laptopservice;
  
  
  @RequestMapping(value="/addlaptop",method=RequestMethod.GET)
  
  public ModelAndView Laptop(@ModelAttribute("laptop")Laptop l, BindingResult
  result) {
  
  ModelAndView mv= new ModelAndView("addlaptop"); mv.addObject("addlaptop",l);
  return mv; }
  
  @RequestMapping(value="/addlaptop") public void
  save(@ModelAttribute("laptop")Laptop laptop) {
  laptopservice.addLaptop(laptop);
  
  }
  
  @RequestMapping(value="/updatelaptop",method=RequestMethod.GET) public
  ModelAndView update(@ModelAttribute("updatelaptop")Laptop laptop) {
  
  ModelAndView mv= new ModelAndView("updatelaptop");
  mv.addObject("updatelaptop",laptop);
  
  return mv;
  
  
  }
  
  @RequestMapping(value="/updatelaptop") public void
  saveupdate(@ModelAttribute("updatelaptop")Laptop laptop) { Processor
  processor= new Processor();
  laptopservice.editLaptop(laptop,processor.getId());
  
  }
  
  @RequestMapping(value="/deletelaptop",method=RequestMethod.GET) public
  ModelAndView delete(@ModelAttribute("deletelaptop")Processor laptop) {
  
  ModelAndView mv= new ModelAndView("deletelaptop");
  mv.addObject("deletelaptop",laptop);
  
  return mv; }
  
  @RequestMapping(value="/deletelaptop") public void
  savedelete(@ModelAttribute("deletelaptop")Processor laptop) {
  laptopservice.deleteLaptop(laptop.getId());
  
  }
  
  @RequestMapping(value="/findlaptop",method=RequestMethod.GET) public
  ModelAndView find(@ModelAttribute("findlaptop")Processor emp) {
  
  ModelAndView mv= new ModelAndView("findlaptop");
  mv.addObject("findlaptop",emp);
  
  return mv;
  
  
  }
  
  
  @RequestMapping(value="/findlaptop") public String
  FindData(@ModelAttribute("findlaptop")Processor p,Model model, BindingResult
  result) {
  
  Laptop l1= laptopservice.findLaptop(p.getId());
  
  model.addAttribute("laptop",l1);
  
  return "seelaptop"; }
  
  @RequestMapping(value="findall",method=RequestMethod.GET) public String
  SeeData(Model model, Laptop p, BindingResult result) {
  
  List<Laptop> l1= laptopservice.findAlllaptop();
  
  
  model.addAttribute("list",l1); return "findall";
  
  }
  
  
  }
  
  
 