package com.bridgelabz.oop1;

import java.io.File;
<<<<<<< HEAD

=======
>>>>>>> 86d9f77761ee8a93c2fc9f08042e88a2c5fcc25f
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

<<<<<<< HEAD
		File file = new File("/home/admin123/eclipse-workspace/oopsWeek3/regex.txt");
=======
		File file = new File("/home/admin123/eclipse-workspace/Week3/regex.txt");
>>>>>>> 86d9f77761ee8a93c2fc9f08042e88a2c5fcc25f
		Scanner scanner = new Scanner(file);
		String string = " ";
		while (scanner.hasNext()) {
			string += scanner.next();
		}
		System.out.println(string);

		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter your  name");
		String name = scanner.nextLine();

		System.out.println("Enter your full name");
		String fullname = scanner.nextLine();

		System.out.println("Enter your mobile  number");
		String mobileno = scanner.nextLine();

		// pattern matching for name
		if (name.matches("[a-zA-Z]")) {
			Pattern p = Pattern.compile("<<name>>");
			Matcher m = p.matcher(string);
			string = m.replaceAll(name);
		} else {
			System.out.println("Your first name should contains A - Z or a - z");
		}

		// pattern matching for full name
		if (fullname.matches("[A-Z][a-z]")) {
			Pattern p = Pattern.compile("<<full name>>");
			Matcher m = p.matcher(string);
			string = m.replaceAll(fullname);
		} else {
			System.out.println("Your full name should contains A - Z or a - z");
		}

		// pattern matching for mobile number
		if (mobileno.matches("[9-5][0-9]")) {
			Pattern p = Pattern.compile("91-xxxxxxxxxx");
			Matcher m = p.matcher(string);
			string = m.replaceAll(mobileno);
		} else {
			System.out.println("Your mobile number must contains 0-9");
		}

		System.out.println(string);

	}

}
