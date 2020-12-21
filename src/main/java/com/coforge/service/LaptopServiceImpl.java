package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.Dao.LaptopDao;
import com.coforge.entity.Laptop;
import com.coforge.entity.Processor;

@Service("LaptopService")
public class LaptopServiceImpl implements LaptopService {
	@Autowired
	LaptopDao laptopdao;

	@Override
	public void addProcessor(Processor processor) {
		laptopdao.addProcessor(processor);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProcessor(Processor laptop, int serial_no) {
		// TODO Auto-generated method stub
		laptopdao.editProcessor(laptop, serial_no);
	}

	@Override
	public void deleteLaptop(int serial_no) {
		// TODO Auto-generated method stub
		laptopdao.deleteLaptop(serial_no);
	}

	@Override
	public void deleteProcessor(int serial_no) {
		// TODO Auto-generated method stub
		laptopdao.deleteProcessor(serial_no);
	}

	@Override
	public Processor find(int serial_no) {
		// TODO Auto-generated method stub
		return laptopdao.find(serial_no);
	}

	@Override
	public List<Processor> findAll() {
		// TODO Auto-generated method stub
		return laptopdao.findAll();
	}

	@Override
	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopdao.addLaptop(laptop);
	}

	@Override
	public void editLaptop(Laptop laptop, int serial_no) {
		// TODO Auto-generated method stub
		laptopdao.editLaptop(laptop, serial_no);
	}

	@Override
	public Laptop findLaptop(int serial_no) {
		// TODO Auto-generated method stub
		return laptopdao.findLaptop(serial_no);
	}

	@Override
	public List<Laptop> findAlllaptop() {
		// TODO Auto-generated method stub
		return laptopdao.findAlllaptop();
	}
}
