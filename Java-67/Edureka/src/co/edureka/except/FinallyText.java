package co.edureka.except;

import java.util.Scanner;

public class FinallyText 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("enter first no: ");
			int x = sc.nextInt();
			System.out.println("enter second no: ");
			int y = sc.nextInt();
			
			int z = x/y;
			System.out.println("result = "+z);
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception: "+ex.toString());
		}
		finally {
			System.out.println("Application Designed & Developed by");
			System.out.println("Team @ edureka");
			sc.close();
		}
		System.out.println("** DONE **");
	}

}
