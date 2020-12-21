package com.coforge.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.entity.Instance;
import com.coforge.entity.Laptop;
import com.coforge.entity.Processor;

@Repository
@Qualifier("LaptopDao")
public class LaptopDaoImpl implements LaptopDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	int id;
	Instance i1= new Instance();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public void addProcessor(Processor processor) {
		

		jdbcTemplate.update("insert into processor(id,generation,company) values(?,?,?)",
				processor.getId(),processor.getGenration(),processor.getCompany());
		
		
		i1.setId(processor.getId());
		System.out.println(processor.getId());
		
		System.out.println("Processor data added");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addLaptop(Laptop laptop) {
	
	
		Integer id1 = i1.getId();
		System.out.println(id1);
		
		
		
			jdbcTemplate.update("insert into laptop2 values (?,?,?,?)",id1,
				laptop.getGraphic_card(),laptop.getRam(),laptop.getCompany());
		
		System.out.println("data of laptop added!!");
		// TODO Auto-generated method stub
		
	}

	
	public void editProcessor(Processor laptop, int serial_no) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update Processor set  generation=?,company=? "
				+ "where id ='"+serial_no+"'",laptop.getGenration(),laptop.getCompany());
		System.out.println("data updated!!");
		
		i1.setId(serial_no);
	}

	@Override
	public void editLaptop(Laptop laptop1, int serial_no) {
		
		// TODO Auto-generated method stub
		int id= i1.getId();
		jdbcTemplate.update("update laptop2 set graphicCard=?, ram=?,company=? "
				+ "where serialNo='"+id+"'",laptop1.getGraphic_card(),laptop1.getRam(),laptop1.getCompany());
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.out.println("data updated!!");
	}

	@Override
	public void deleteLaptop(int serial_no) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("DELETE from laptop2 WHERE serialNo = ?",serial_no); 
		System.out.println("data Deleted!!");
		
	}


	public void deleteProcessor(int serial_no) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("DELETE from processor WHERE id = ?",serial_no); 
		System.out.println("data Deleted!!");
		
	}
	

	
	public Processor find(int serial_no) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Processor lap= (Processor)jdbcTemplate.queryForObject("select * from processor where id= ? ",
				new Object[]{serial_no},new BeanPropertyRowMapper(Processor.class));
		// TODO Auto-generated method stub
		
		return lap ;
		
		
	}
	
	public Laptop findLaptop(int serial_no) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Laptop lap= (Laptop)jdbcTemplate.queryForObject("select * from laptop2 where serialNo= ? ",
				new Object[]{serial_no},new BeanPropertyRowMapper(Laptop.class));
		// TODO Auto-generated method stub
		
		return lap ;
		
		
	}


	public List<Processor> findAll() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Processor> lap1= jdbcTemplate.query("select * from processor",new BeanPropertyRowMapper(Processor.class));
		// TODO Auto-generated method stub
		System.out.println(lap1);
		return (List<Processor>) lap1;
		// TODO Auto-generated method stub
	
	}
	
	public List<Laptop> findAlllaptop() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Laptop> lap1= jdbcTemplate.query("select * from laptop2",new BeanPropertyRowMapper(Laptop.class));
		// TODO Auto-generated method stub
		return (List<Laptop>) lap1;
		// TODO Auto-generated method stub
	
	}
	
	

}
