package com.bridgelabz.oop1;

import java.io.File;
import java.io.IOException;

public class StockTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("/home/admin123/eclipse-workspace/oopsWeek3/stock.txt");
		StockUtil stockUtil = new StockUtil();
		@SuppressWarnings("unused")
		StockClass stockClass = new StockClass();
		stockClass = stockUtil.getReport(file);
	}

}
