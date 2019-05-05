package com.bridgelabz.oop1;

public class CompanyShareP {

	private String name;
	private int share;
	private double price;
	private String date;

	public CompanyShareP() {

	}

	public CompanyShareP(String name, int share, double price, String date) {
		this.name = name;
		this.share = share;
		this.price = price;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShare() {
		return share;
	}

	public void setShare(int share) {
		this.share = share;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString() {
		return "Company =  [ name : " + name + ", share : " + share + ", price : " + price + ", date : " + date + "] ";
	}

}
