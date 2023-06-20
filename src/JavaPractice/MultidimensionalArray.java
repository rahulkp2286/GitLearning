package JavaPractice;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//x - row , y - column
		/*
		 * int a[][] = new a[]y];
		 * int a[row][column] = new a[x][y];
		 * 
		 * 22 43 51
		 * 33 46 72 
		 * 23 42 21
		 */
		
		int a[][] = new int[2][3];
		a[0][0] = 22;
		a[0][1] = 43;
		a[0][2] = 51;
		a[1][0] = 33;
		a[1][1] = 46;
		a[1][2] = 72;
		
		System.out.println(a[1][0]);//33
		
		System.out.println("************");
		
		for (int i = 0;i<a.length;i++) {
			for(int j = 0;j<=a.length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("************");
		
		for (int i = 0;i<2;i++) {
			for(int j = 0;j<3;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("************");
		
		//b[row][column]={{x},{y}}
		int b[][] = {{22,43,51},{33,46,72},{23,42,21}};
		System.out.println(b[2][1]); //42
		
		System.out.println("************");
		
		System.out.println("length is :"+ b.length);
		for (int i = 0;i<b.length;i++) { //row
			for(int j = 0;j<b.length;j++) { //column
				System.out.println(b[i][j]);
			}
		}
		
		System.out.println("************");
		
		
		
	}

}
