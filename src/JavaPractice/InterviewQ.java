package JavaPractice;

public class InterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 *2 4 5
		 * 3 6 7 
		 * 8 9 10
		 */
		
		//print smallest number in 3*3 matix
		
		int c[][] = {{2,4,5},{3,6,7},{8,9,1}}; //traverse from each and every number 
		int min = c[0][0];
		
		for (int i = 0;i<3;i++) //row
		{ 		
			for(int j = 0;j<3;j++) //column
			{ 
				if(c[i][j]<min) 
				{
					min = c[i][j];
				}
			}
		}
		System.out.println(min);
		
		
		System.out.println("************");
		
		/* 
		 *2 4 5
		 * 3 6 7 
		 * 8 9 10
		 */
		
		//print max number in 3*3 matix
		
		int d[][] = {{2,4,5},{3,6,7},{8,9,10}}; //traverse from each and every number 
		int max = d[0][0];
		
		for (int i = 0;i<3;i++) //row
		{ 		
			for(int j = 0;j<3;j++) //column
			{ 
				if(d[i][j]>max) 
				{
					max = d[i][j];
				}
			}
		}
		System.out.println(max);
		
		System.out.println("************");
		
		/* 
		 *3 11 5
		 *3 4 7 
		 *2 1 10
		 *
		 *1. find the min number
		 *2. identify the column of min nuumber 
		 *3. find the max number identified coulmn
		 */
		
		int e[][] = {{3,11,5},{3,4,7},{2,1,10}}; //traverse from each and every number 
		int minNum = e[0][0];
		int minColumn = 0;
		
		for (int i = 0;i<3;i++) //row
		{ 		
			for(int j = 0;j<3;j++) //column
			{ 
				if(e[i][j]<minNum) 
				{
					minNum = e[i][j];
					minColumn = j;
					System.out.println("minC "+minColumn);
				}
			}
		}
		int maxNum = e[0][minColumn];
		int k = 0;
		while(k<3) {
			if(e[k][minColumn]> maxNum) {
				maxNum = e[k][minColumn];
			}
			k++;
		}
		
		System.out.println("maxN "+maxNum);
	}

}
