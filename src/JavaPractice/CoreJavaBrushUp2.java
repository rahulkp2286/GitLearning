package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i] + "multiple of 2 ");
				break;
			} else {
				System.out.println(arr2[i] + "not a multiple of 2 ");
			}
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Panchal");
		a.add("Selenium");
		System.out.println(a.get(2));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));

		}

		System.out.println("*********");

		for (String val : a) {
			System.out.println(val);
		}

		System.out.println("*********");
		//item present in the Arraylist
		
		System.out.println(a.contains("Selenium"));
		
		String[] name = { "Rahul", "Panchal", "Selenium" };
		
		System.out.println("name length " + name.length );
		for (int i = 0; i < name.length; i++) 
		{		
			System.out.println("name is " + name[i] );
		}
		
		List<String> NameArrayList = Arrays.asList(name);
		System.out.println("NameArrayList size is  " + NameArrayList.size());
		System.out.println(NameArrayList.contains("Selenium"));
		
		for (int i = 0; i < NameArrayList.size(); i++) 
		{
			System.out.println("NameArrayList is " +NameArrayList.get(i));
		}
	}

}
