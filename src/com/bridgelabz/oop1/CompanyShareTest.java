package com.bridgelabz.oop1;

import java.io.File;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class CompanyShareTest {
	public static void main(String[] args) {
		CompanyShareP share[];
		CompanyShareLinkedList<Integer> list = new CompanyShareLinkedList<Integer>();
		ObjectMapper mapper = new ObjectMapper();
		String pathname = "/home/admin123/eclipse-workspace/oopsWeek3/companyshare.json";
		File file = new File(pathname);
		String string1[] = { "first", "second", "third", "fourth" };

		try {
			for (int i = 0; i < string1.length; i++) {
				JsonNode node = mapper.readTree(file);
				JsonNode node1 = node.get(string1[i]);
				share = mapper.readValue(node1, CompanyShareP[].class);
				int numberofshare = share[0].getShare();
				list.add(numberofshare);

			}

			list.display();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
