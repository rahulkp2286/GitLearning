package JavaPractice;

public class FunctionOverloading {

	/*
	 * common rules : either argument should be different for same method name or 
	 * argument data type/return type should be different 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading a = new FunctionOverloading();
		a.getData(1);
		a.getData("Hello");
		a.getData(2,5);
		
		
	}
	
	public void getData(int a)
	{ 
		System.out.println(a);
	}
	public void getData(String a)
	{ 
		System.out.println(a);
	}
	public void getData(int a, int b)
	{ 
		System.out.println(b);
	}

}
