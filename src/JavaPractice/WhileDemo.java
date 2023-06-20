package JavaPractice;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print numbers from 1-10

//				for(int i = 0;i<10;i++) {
//					System.out.println(i);
//				}
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("********While loop**********");
		// print numbers from 1-10 in reverse

		int j = 10;
		while (j > 0) // while syntax : while(boolean expression)
		{
			System.out.println(j);
			j--;
		}

		System.out.println("********do While loop**********");

		// print numbers from 20-300
		int k = 20;
		do {
			System.out.println(k);
			k++;

		} while (k <= 30); // 1 loop of execution is guarantee

	}

}
