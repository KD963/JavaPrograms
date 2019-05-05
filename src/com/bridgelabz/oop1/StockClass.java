package com.bridgelabz.oop1;

public class StockClass {

	private String stockName;
	private int numberOfStock;
	private double price;

	public StockClass() {

	}

	public StockClass(String stockName, int numberOfStock, double price) {
		this.stockName = stockName;
		this.numberOfStock = numberOfStock;
		this.price = price;

	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}

	public double getPrice() {
		return price;
	} 

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Stock [stockName = " + stockName + ", number = " + numberOfStock + ", price =" + price + "]";
	}

}
