package JavaPractice;

public class NestedLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int k = 3;
		for (int i = 1; i < 5; i++) //row 
			{
			// System.out.println("outer loop started");
			for (int j = 1; j <= i; j++) ///column // inner loop
			{
				
				System.out.print(k);
				System.out.print("\t");
				k = k + 3;
			}
			System.out.println("");

		}
		
/*
3	
6	9	
12	15	18	
21	24	27	30
*/
		System.out.println("************************");
		int m = 1;
		
		for (int i = 1; i < 5; i++) {
			// System.out.println("outer loop started");
			for (int j = 1; j <= i; j++) // inner loop
			{
				
				System.out.print(m);
				System.out.print("\t");
				m++;
			}
			System.out.println("");

		}
/*
1	
2	3	
4	5	6	
7	8	9	10
*/
		System.out.println("************************");
		
		for (int i = 1; i < 5; i++) {
			// System.out.println("outer loop started");
			for (int j = 1; j <= i; j++) // inner loop
			{
				System.out.print(j);				
				System.out.print("\t");
				
			}
			System.out.println("");

		}
/*
1	
1	2	
1	2	3	
1	2	3	4
*/
		
	}

}
