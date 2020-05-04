import java.util.Scanner;

public class Naturals 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  
  System.out.print("enter how many natural numbers: ");
  int n = sc.nextInt();
  
  printNaturals(n);
 }

 static void printNaturals(int n) 
 {
   	System.out.println("First "+n+" Natural Numbers are:");
   	for(int i=1;i<=n;i++) 
   	{
   		if(i==n)
   			System.out.println(n);
   		else
   			System.out.print(i+", ");
   	}
 }
}
