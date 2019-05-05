package com.bridgelabz.oop1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

	public boolean Validation(String str) {
		boolean result = false;
		if (str.matches("[a-z][A-Z]")) {
			result = true;
			return result;
		} else {
			return false;
		}
	}

	public boolean validate(String str1) {
		Pattern pattern = Pattern.compile("[9-5][0-9]");
		Matcher matcher = pattern.matcher(str1);
		return (matcher.find() && matcher.group().equals(str1));

	}

}
