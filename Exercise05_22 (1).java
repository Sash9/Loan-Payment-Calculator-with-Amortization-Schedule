/******************************************************************************

Pseudocode:

Create veriables for principal, balance, interest, loan

ask user for loan, year, and interest

Use this to get things like months, monlthy interest

Use monthlyPayment equation to get monthlyPayment

Calulcate the principal, balance, and interest in a for loop

print until months are over

*******************************************************************************/
import java.util.*;
import java.lang.Math;

public class Exercise05_22
{
	public static void main(String[] args) {
		
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		// declare double variables loanAmount and interest;
		double loanAmount, yearlyInterest, monthlyInterest, interestAmount, principal, balance, monthlyPayment;
		
		// declare int variable years
		int years, months;
		
		// Prompt user for loanAmount
		System.out.print("Loan Amount: ");
		
		loanAmount = input.nextDouble();
		
		// Prompt user for years
		System.out.print("Number of Years: ");
		
		years = input.nextInt();
		
		// Prompt user for interest rate
		System.out.print("Annual Interest Rate: ");
		
		// calulcate total months loan will last based on user input of year
		months = years * 12;
		
		
		yearlyInterest = input.nextDouble();
		
		
		// calulcate monthlyInterest by dividing by 100 and then 12
		monthlyInterest = (yearlyInterest/100) / 12;
		
		// balance starts off at loanAmount
		balance = loanAmount;
		
		// interest
		interestAmount = monthlyInterest * loanAmount;
		
		// using monthlyPanyment equation to get the overall monhtly payment
		monthlyPayment = (loanAmount * monthlyInterest * Math.pow((1 + monthlyInterest), months))/
		(Math.pow(1 + monthlyInterest, months)-1);
		
		//print f to format monthlypayment to two decimals
		System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
		
		//print f to format totalPayment to two decimals
		System.out.printf("Total Payment: %.2f%n", monthlyPayment * 12);
		
		// Titles. using \t to format
		System.out.println("Payment\t\tInterest\tPrincipal\tBalance");
		
		// for loop to print all numbers until months are over
		for (int i = 1; i <= months; i++)
		{
		    // calculations for principal, balance, and interestAmount
		    principal = monthlyPayment - interestAmount;
		    balance = balance - principal;
		    
		    // print all numbers
		    System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f%n", i, interestAmount, principal, balance);
		    
		    interestAmount = monthlyInterest * balance;
		    
		    
		    
		}
		
		
		
		
		
		
		
		
		
	}
}
