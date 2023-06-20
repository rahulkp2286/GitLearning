package JavaPractice;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodDemo d = new MethodDemo();
		String name = d.getData(); // returned string is stored in string variable called String "name -Rahul"
		System.out.println(name);

		MethodDemo2 d2 = new MethodDemo2(); // created object of another class and called the method in that class using
											// the object of that class
		String name2 = d2.getUserData();
		System.out.println(name2);

		String name3 = getData2();
		System.out.println(name3);

	}

	public String getData() // Return type is String so mention String in method declaration
	{
		System.out.println("hello world");
		return "Rahul";
	}

	public static String getData2() // static will move to class level and no need to create object of class
	{
		System.out.println("hello world Static");
		return "RahulS";
	}

}
