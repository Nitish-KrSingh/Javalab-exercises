package week1_220970064;
import java.util.Scanner;

class Program5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double rate, loanAmt, loanPeriod;

		System.out.print(" Enter the loan amount: ");
		loanAmt = sc.nextDouble();

		System.out.print("Enter the loan period(in years): ");
		loanPeriod = sc.nextDouble();

		System.out.println(" Interest Rate \t Monthly Payment \t Total Payment");

		for(rate = 5; rate <= 8; rate += 0.125)
		{
			//double monthlyInterestRate = annualInterestRate / 1200;
            //double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			double monthIRate = rate/1200;
			double monthlyPay = (loanAmt * monthIRate) / (1 - 1 / Math.pow(1 + monthIRate, loanPeriod * 12));
			double totalPayment = monthlyPay * loanPeriod * 12;
			System.out.println(rate+ "\t\t" +(float)monthlyPay+ "\t\t" +(float)totalPayment);

		}
	}
}