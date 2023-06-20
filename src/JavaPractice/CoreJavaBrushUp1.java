package JavaPractice;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num = 5;
		String Website = "Rahul Panchal";
		char letter = 'r';
		double dec = 6.99 ;
		boolean mycard = true;
		
		System.out.println(Num+  "is an integer value  and stored in variable Num " );
		System.out.println(Website);
		
		//Array
		int[] arr = new int [5];
		arr [0] = 1;
		arr [1] = 5;
		arr [2] = 4;
		arr [3] = 3;
		arr [4] = 2;
		
		int[] arr2 = {1,5,4,3,2,33,553, 23};	
		
		// for loop //arr2.lenght -> 5
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("*********");
		
		 
         for (int i = 0; i < arr2.length; i ++)
         {
        	 System.out.println(arr2[i]); //array of [0,1,2,3,4] value will print 
         }
         System.out.println("*********");
         //enhanced for loop 
         for (int val : arr2) {
         	System.out.println(val);
         }
         System.out.println("*********");
         
         //String array 
         String[] name = {"Rahul","Panchal","Selenium"};

        for(int i=0; i<name.length;i++) {
        	System.out.println(name[i]);
        }
        System.out.println("*********");
        
       
        for(String s : name)
        {
        	System.out.println(s);
        }
        	
	}
}
