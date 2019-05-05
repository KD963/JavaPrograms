package com.bridgelabz.oop1;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class StockAccountTest {
	public static void main(String[] args) throws IOException {

		CompanyShare companyshare[];
		String pathname = "/home/admin123/eclipse-workspace/oopsWeek3/CDP.json";
		String pathname1 = "/home/admin123/eclipse-workspace/oopsWeek3/replacedData.json";
		File file = new File(pathname);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(file);
		JsonNode node1 = node.get("first");
		companyshare = mapper.readValue(node1, CompanyShare[].class);
		StockAccount stock = new StockAccount(companyshare);
		stock.buy(100, "Idea");
		stock.printReport(companyshare);
		File file1 = new File(pathname1);
		JsonNode node2 = mapper.readTree(file);
		JsonNode node3 = node2.get("first");

		int number = companyshare[0].getShare();
		double price = companyshare[0].getPrice();
		System.out.println(number);
		mapper.writeValue(file1, companyshare);

	}

}
