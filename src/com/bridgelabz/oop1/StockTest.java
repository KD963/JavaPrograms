package com.bridgelabz.oop1;

import java.io.File;
import java.io.IOException;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 0518accb6ace976e0106803c710d267c7607abad
>>>>>>> 86d9f77761ee8a93c2fc9f08042e88a2c5fcc25f

public class StockTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

<<<<<<< HEAD
		File file = new File("/home/admin123/eclipse-workspace/oopsWeek3/stock.txt");
		StockUtil stockUtil = new StockUtil();
		@SuppressWarnings("unused")
=======
<<<<<<< HEAD
		File file = new File("/home/admin123/eclipse-workspace/oopsWeek3/stock.txt");
		StockUtil stockUtil = new StockUtil();
		@SuppressWarnings("unused")
=======
		File file = new File("/home/admin123/eclipse-workspace/Week3/stock.txt");
		StockUtil stockUtil = new StockUtil();
>>>>>>> 0518accb6ace976e0106803c710d267c7607abad
>>>>>>> 86d9f77761ee8a93c2fc9f08042e88a2c5fcc25f
		StockClass stockClass = new StockClass();
		stockClass = stockUtil.getReport(file);
	}

}
