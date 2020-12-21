package com.coforge.service;

import java.util.List;

import com.coforge.entity.Laptop;
import com.coforge.entity.Processor;

public interface LaptopService {
	public void addProcessor(Processor processor);

	public void editProcessor(Processor laptop,int serial_no);
	
	public void deleteLaptop(int serial_no);
	public void deleteProcessor(int serial_no);
	public Processor find(int serial_no);
	public List<Processor> findAll();
	void addLaptop(Laptop laptop);

	void editLaptop(Laptop laptop, int serial_no);
	
	Laptop findLaptop(int serial_no);
	List<Laptop> findAlllaptop();
}