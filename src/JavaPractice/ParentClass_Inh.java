package JavaPractice;

public class ParentClass_Inh {

	 public String color = "Red"; //when child class is in different package : : ChildClass1_inh "public"
	// String color = "Red";// when child class is in same package : ChildClass2_inh
	public void gear()
	{
		System.out.println("gear code is implemented");
	}
	
	public void brakes()
	{
		System.out.println("brakes code is implemented");
	}
	
	public void headLight()
	{
		System.out.println("headLight code is implemented");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	/*method for function overriding
	 * 
	 */
	public void audioSystem() {
		
			System.out.println("audioSystem is implemented parent");
		
	}
	


	public void tailLight()
	{
		System.out.println("tailLight code is implemented");
	}
}
