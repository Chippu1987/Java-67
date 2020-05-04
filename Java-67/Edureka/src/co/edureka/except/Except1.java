package co.edureka.except;

import java.util.Scanner;

public class Except1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x/y;
		System.out.println(x+" / "+y+" = "+z);
		sc.close();
		System.out.println("** DONE **");
	}
}
