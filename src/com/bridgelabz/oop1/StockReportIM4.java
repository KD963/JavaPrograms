package com.bridgelabz.oop1;

import java.awt.Stroke;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class StockReportIM4 {

	public static void main(String[] args) throws JsonProcessingException, IOException {
		// TODO Auto-generated method stub
		StockClass stock1[];
		int numberOfshare = 0;
		double price = 0;

		ObjectMapper mapper = new ObjectMapper();
		File file = new File("/home/admin123/eclipse-workspace/Week3/stockReport.json");

		JsonNode node = mapper.readTree(file);
		JsonNode node1 = null;

		System.out.println("------------------Idea----------------");
		node1 = node.get("first");
		stock1 = mapper.readValue(node1, StockClass[].class);
		for (StockClass stock2 : stock1) {
			System.out.println(stock2);
			price = price + stock2.getPrice();
			numberOfshare += stock2.getNumberOfStock();
		}
		System.out.println("");

		System.out.println("-------------------Airtel--------------");
		node1 = node.get("second");
		stock1 = mapper.readValue(node1, StockClass[].class);
		for (StockClass stock2 : stock1) {
			System.out.println(stock2);
			price = price + stock2.getPrice();
			numberOfshare += stock2.getNumberOfStock();

		}
		System.out.println(" ");

		System.out.println("--------------------Jio----------------");
		node1 = node.get("third");
		stock1 = mapper.readValue(node1, StockClass[].class);
		for (StockClass stock2 : stock1) {
			System.out.println(stock2);
			price = price + stock2.getPrice();
			numberOfshare += stock2.getNumberOfStock();

		}

		System.out.println(" ");

		System.out.println("-----------------Vodafone--------------");
		node1 = node.get("fourth");
		stock1 = mapper.readValue(node1, StockClass[].class);
		for (StockClass stock2 : stock1) {
			System.out.println(stock2);
			price = price + stock2.getPrice();
			numberOfshare += stock2.getNumberOfStock();
		}

		System.out.println("Total price " + price);
		System.out.println("Total number of share " + numberOfshare);
	}

}
