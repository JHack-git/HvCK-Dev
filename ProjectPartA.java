/*
 * name: Jamal Hackett
 * Date: Feb 3, 2020
 * Assignment: ProjectPartA
 * Psuedocode:
 * 		Declare a variable to support the menu
 * 		prompt the user for menu choice
 * 		If user enters 1 
 * 			Delcare Wage Calculator variables 
 * 			prompt the user for name, hourly wage, and hours worked
 * 			if users hours are greater than Max hours 
 * 				calculate the overtime pay + total pay
 * 				display overtime pay with total pay
 * 			else calcuate total pay
 * 				display total pay
 * 		if user enters 2
 * 			declare Tip calculator Variables
 * 			prompt the user for satisfaction level
 * 			if user enters 1,2,or3 
 */
import java.util.Scanner;

public class ProjectPartA 
{

	public static void main(String[] args) 
	{
		int calculator;                                                                                //Declare variable
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Calculator Menu \n1) Wage Calculator \n2) Tip Calculator \n3) Exit");      //Prompt user for menu choice 
		System.out.println("Please enter your choice: ");
		calculator = scan.nextInt();																
		
		switch (calculator) {																			//Declare a decision
			case 1:
				final double MAX_HOURS = 40;															//Declare varibles for case 1
				String firstName;
				String lastName;
				double hourlyWage;																		
				double hours;
				double overtimeHours = 0;
				double regularPay;
				double overtimePay = 0;
				double totalPay;
																										
				System.out.println("Please enter your first name: ");											//prompt user for name, hourly wage, and hours worked
				firstName = scan.next();
				System.out.println("Please enter you Last name: ");
				lastName = scan.next();
				System.out.println("Please enter your hourly wage: ");
				hourlyWage = scan.nextDouble();
				System.out.println("Please enter your hours worked: ");
				hours = scan.nextDouble();
				
				if (hours > MAX_HOURS) {
					final double OT_RATE = 1.5;
					overtimeHours = (hours - MAX_HOURS);
					overtimePay = (hourlyWage * OT_RATE) * overtimeHours;
					regularPay = MAX_HOURS * hourlyWage;
					totalPay = regularPay + overtimePay;
					
					System.out.printf("\nHello %s %s\n", firstName, lastName);
					System.out.printf("Your regular hours worked is %.1f. Your overtime hours worked are %.1f\n", MAX_HOURS, overtimeHours);
					System.out.printf("Your regular pay: $%.2f\n", regularPay);
					System.out.printf("Your overtime pay: $%.2f\n", overtimePay);
					System.out.printf("Your total Pay: $%.2f\n", totalPay);
				}
				else {
					regularPay = hours * hourlyWage;
					totalPay = regularPay + overtimePay;
					
					System.out.printf("\nHello %s %s\n", firstName, lastName);
					System.out.printf("Your regular hours worked is %.1f. Your overtime hours worked are %.1f\n", hours, overtimeHours);
					System.out.printf("Your regular pay: $%.2f\n", regularPay);
					System.out.printf("Your overtime pay: $%.2f\n", overtimePay);
					System.out.printf("Your total Pay: $%.2f\n", totalPay);
				}
				System.out.printf("Thank you for using the Wage Calculator %s! \nHave a great day!", firstName);
				
				break;
				
			case 2:																						//Declare second decision
				int sLevel;
				double dinnerTotal;
				double tipAmount;
				
				System.out.println("Please enter satisfaction Level (1=Totally Satisfied, 2=Satisfied, 3=Dissatisfied): ");  //prompt user for satisfaction level
				sLevel = scan.nextInt();
				System.out.println("Please enter your dinner total: ");
				dinnerTotal = scan.nextDouble();
				
				if (sLevel == 1) {
					final double TIP = 0.20;
					tipAmount = dinnerTotal * TIP;
					System.out.printf("Your tip amount is $%.2f (Totally Satisfied).\n", tipAmount);
					
					
				}
				else if (sLevel == 2) {
					final double TIP = 0.15;
					tipAmount = dinnerTotal * TIP;
					System.out.printf("Your tip amount is $%.2f (Satisfied).\n", tipAmount);
					
				}
				else if (sLevel == 3) {
					final double TIP = 0.1;
					tipAmount = dinnerTotal * TIP;
					System.out.printf("Your tip amount is $%.2f (dissatisfied).\n", tipAmount);
				}
				
				
				
				System.out.println("Thank you for using Tip Calulator! \nHave a great day!");
					
				
				break;
			case 3:                                                                             //Declare base case
				System.out.println("Have a great day!");
				break;
		}//case (Wage Calculator, Tip Calculator)
	}//class
}//main
