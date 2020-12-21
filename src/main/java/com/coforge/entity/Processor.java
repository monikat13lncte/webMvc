package com.coforge.entity;

public class Processor {
	int id;
	String genration;
	String company;
	Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGenration() {
		return genration;
	}
	public void setGenration(String genration) {
		this.genration = genration;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Processor [id=" + id + ", genration=" + genration + ", company=" + company + ", laptop=" + laptop + "]";
	}
	

}
