package com.bridgelabz.oop1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StockUtil {

	public StockClass getReport(File file) throws IOException {

		Scanner scanner = new Scanner(file);
		String name = null;
		int number = 0;
		double price = 0.0;
		StockClass stock1 = null;
		double totalPrice = 0;
		int totalShare = 0;

		while (scanner.hasNext()) {
			name = scanner.next();
			number = scanner.nextInt();
			price = scanner.nextDouble();
			stock1 = new StockClass(name, number, price);
			System.out.println(stock1);
			totalPrice = totalPrice + stock1.getPrice();
			totalShare = totalShare + stock1.getNumberOfStock();
		}
		System.out.println("Total price " + totalPrice);
		System.out.println("Total share " + totalShare);
		return stock1;

	}

}
