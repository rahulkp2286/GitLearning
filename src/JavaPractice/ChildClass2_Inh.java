package JavaPractice;

public class ChildClass2_Inh extends ParentClass_Inh{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass2_Inh c2 = new ChildClass2_Inh();
		c2.tailLight();
		c2.headLight();
		c2.colorc2();
		c2.brakes();
		c2.enginec2();
		c2.gear();
		c2.enginec2();

	}
	/*
tailLight code is implemented
headLight code is implemented
Red
brakes code is implemented
new engine c2 code
gear code is implemented
new engine c2 code

	 */
	
public void enginec2() {
	System.out.println("new engine c2 code");
	}

public void colorc2() {
	System.out.println(color);
}

}
