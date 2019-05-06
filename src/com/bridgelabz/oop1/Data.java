package com.bridgelabz.oop1;

public interface Data {
	void StockAccount(String filename);
	double valueOf();
	void sell(int amount, String symbol);
	void buy(int amount, String symbol);
	void save(String filename);
	void printReport();
	
}
