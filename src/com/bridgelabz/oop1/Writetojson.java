package com.bridgelabz.oop1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Writetojson {

	static StockClass stock1[];

	public static void main(String[] args) throws JsonProcessingException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();

		File file = new File("/home/admin123/eclipse-workspace/Week3/stockReport.json");
		File file1 = new File("/home/admin123/eclipse-workspace/Week3/writeReport.json");

		System.out.println("Take a look on writeReport json file");
		ArrayList<StockClass> stock2 = new ArrayList<StockClass>();
		JsonNode node = mapper.readTree(file);
		JsonNode node1 = node.get("second");
		stock1 = mapper.readValue(node1, StockClass[].class);
		for (StockClass stock3 : stock1) {
			stock2.add(stock3);
		}
		mapper.writeValue(file1, stock2);

	}

}
