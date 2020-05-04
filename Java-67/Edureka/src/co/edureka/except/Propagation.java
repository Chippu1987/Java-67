package co.edureka.except;

import java.util.Scanner;

public class Propagation 
{
	static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = x / y;
		System.out.println(x + " / " + y + " = " + z);
		sc.close();
	}
	static void method2() {
		method1();
	}
	static void method3() {
		method2();
	}

	public static void main(String[] args) {
		method3();
	}
}
