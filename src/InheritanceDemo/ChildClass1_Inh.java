package InheritanceDemo;

import JavaPractice.ParentClass_Inh;

public class ChildClass1_Inh extends ParentClass_Inh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1_Inh c1 = new ChildClass1_Inh();
		c1.brakes();
		c1.gear();
		c1.headLight();
		c1.colorc1();
		c1.tailLight();
		c1.enginec1();
		c1.audioSystem();
		
	}
/*
brakes code is implemented
gear code is implemented
headLight code is implemented
Red
tailLight code is implemented
new engine c1 code

*/
	public void enginec1() {
		System.out.println("new engine c1 code");
	}

	public void colorc1() {
		System.out.println(color);
	}
	
	
	/*method for function overriding : override method in parent with same name and executes local method
	 */
	
	public void audioSystem() 
	{		
		System.out.println("audioSystem is implemented child");	
	}
}
