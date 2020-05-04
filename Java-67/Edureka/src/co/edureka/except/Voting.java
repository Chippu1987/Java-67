package co.edureka.except;

import java.util.Scanner;

public class Voting 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 String req="Y";
	 
	 while(req.equalsIgnoreCase("Y")) 
	 {
	  try {	 
	   System.out.print("enter age of voter: ");
	   int age = sc.nextInt();
	   if(age<18)
		   throw new InvalidAgeException("age should be >= 18");
	   else
		   System.out.println("VOTING DONE!");
	  }
	  catch(Exception ex) {
		  System.out.println("EXCEPTION: "+ ex.toString());
	  }
	  System.out.print("NEXT VOTER [Y/N]: ");
	  req=sc.next();
	 }//while
	 sc.close();
	}
}
