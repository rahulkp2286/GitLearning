package InterfaceDemo;

import JavaPractice.Centraltraffic_Int; //calling interface from different package 
import JavaPractice.Continenttraffic_Int;

public class Canadatraffic_Int implements Centraltraffic_Int, Continenttraffic_Int{

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Centraltraffic_Int a = new Canadatraffic_Int();//object "a" created to access method in "interface : Centraltraffic " :  Canadatraffic
	
		a.greenGo(); //using object "a" implemented method from "interface" to this class Canadatraffic
		a.yellowFlashSlow(); //using object "a" implemented method from "interface" to this class Canadatraffic
		a.redStop(); //using object "a" implemented method from "interface" to this class Canadatraffic
		
		Canadatraffic_Int at = new Canadatraffic_Int(); //object "at" created to access method "within class" : Canadatraffic
		at.walkSign(); //using object "at" access methods present within class this class Canadatraffic
		
		Continenttraffic_Int ct = new Canadatraffic_Int(); //object "ct" created to access method in "interface : Continenttraffic" :  Canadatraffic
		ct.trainSymbol(); //using object "ct" implemented method from "interface" to this class Canadatraffic
		
		
	}
	
	public void walkSign() {
		System.out.println("walkSign : walking");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
		
	}

	@Override
	public void yellowFlashSlow() {
		// TODO Auto-generated method stub
		System.out.println("yellowFlashSlow implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop implementation");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("trainSymbol implementation");
		
	}

}
