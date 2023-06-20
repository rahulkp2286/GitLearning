package JavaPractice;

public abstract class ParentAirCraft_Ab { /*Abstract class  [keyword "abstract" to className] :
										 method with body & method without body [keyword "abstract" to method ]*/

	public void engine() { //method with body 
		
		System.out.println("Follow Engine Guideline"); 
	}
	
	public void safetyGuidelines() { //method with body 
		
		System.out.println("Follow Safety Guideline");
	}
	
	public abstract void bodyColor(); //method without  body 
	
}
