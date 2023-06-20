package JavaPractice;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nested loop works
		for (int i = 1; i <= 4; i++) {
			System.out.println("outer loop started");
			for (int j = 1; j <= 4; j++) {
				System.out.println("inner loop");

			}
			System.out.println("outer loop Finished");
		}

		System.out.println("********print numbers from 1-10 in downfall/downword pyramid**********");
		// print numbers from 1-10 in reverse pyramid

		int k = 1;
		for (int i = 0; i < 4; i++) {
			// System.out.println("outer loop started");
			for (int j = 1; j <= 4 - i; j++) // inner loop
			{
				System.out.print(k);
				System.out.print("\t");
				k++;

			}
			System.out.println("");
		}
/*
1	2	3	4	
5	6	7	
8	9	
10	

*/
	}

}
