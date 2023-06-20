package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string is an object which represents sequence of char

		// 2 ways you can define string

		// String 1 literal
		// String s = "Rahul Shetty Academy";
		// String s1 = "Rahul Shetty Academy";
		// both string has same value so only one object is created

		String s5 = "hello";

		// String 2 - new memory allocator

		String s2 = new String("Welcome");

		String s3 = new String("Welcome");

		String s = "Rahul Shetty Academy";
//		String[] SplittedString = s.split(" ");
//				[0] - Rahul
//				[1] - Shetty
//				[2] - Academy
//		System.out.println(SplittedString[0]);
//		System.out.println(SplittedString[1]);
//		System.out.println(SplittedString[2]);

		String[] SplittedString = s.split("Shetty");

		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1].trim());
		// System.out.println(SplittedString[2]);

		List<String> SplitStringName = Arrays.asList(SplittedString);
		for (int i = 0; i < SplitStringName.size(); i++) {
			System.out.println(SplitStringName.get(i).trim());

		}

		System.out.println("********");

		System.out.println(s.length());

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.charAt(i));
		}

		// reverse string Ymedaca yttehs luhar

		System.out.println("********");

		System.out.println(s.length());

		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.println(s.charAt(i));
		}

	}

}
