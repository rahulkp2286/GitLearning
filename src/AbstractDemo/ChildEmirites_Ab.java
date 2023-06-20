package AbstractDemo;

import JavaPractice.ParentAirCraft_Ab;

public class ChildEmirites_Ab extends ParentAirCraft_Ab{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirites_Ab c = new ChildEmirites_Ab();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		
		//ParentAirCraft p = new ParentAirCraft(); 
		/*Cannot instantiate the type ParentAirCraft error occurs , to remove error, remove abstract from parent class*/ 
	}

	@Override
	public void bodyColor() { //mandatory abstract method need to be implemented in child class or it will throw compile error 
		// TODO Auto-generated method stub
		System.out.println("Emirates implement own bodyColor : Red Color  ");
	}

}
