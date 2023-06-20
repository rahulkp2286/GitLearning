package JavaPractice;


/*
 * if you have an amount of $100 and you compound it 10% annually, then by what
 * year will amount convert to $200. Write a java program. 
 * 
 * Java program thatcalculates the number of years it takes for an initial amount to double with
 * a given annual compound interest rate:
 * 
 * 
 * In this program, we start with an
 * initial amount of $100 (initialAmount), and the target amount is $200
 * (targetAmount). The interest rate is 10% per year (interestRate).
 * 
 * We initialize the years variable to 0. Then, we use a while loop to
 * continuously increase the initial amount by the interest rate until it
 * reaches or exceeds the target amount. For each iteration, we add the interest
 * earned (initialAmount * interestRate) to the initial amount.
 * 
 * Once the loop exits, we print the number of years it took to double the
 * amount.
 * 
 * When you run this program, it will output:
 * 
 * It will take approximately 8 years to double the amount.
 * 
 * So, in approximately 7 years with a 10% annual compound interest rate, the initial amount of $100 will convert to $200.

 * 
 */

public class CompoundInterest2 {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
	
		        double initialAmount = 100.0;
		        double targetAmount = 200.0;
		        double interestRate = 0.10;
		        double amount = 0.0;

		        int years = 0;
		        while (initialAmount < targetAmount) {
		            amount = initialAmount * interestRate;
		            initialAmount = amount + initialAmount;
		            years++;
		            
		        }

		        System.out.println("It will take approximately " + years + " years to double the amount.");
		 

	}

}
