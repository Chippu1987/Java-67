package co.edureka.except;

public class Except2 
{
	public static void main(String[] args)
	{
		String s = "625";
		System.out.println(s+25); //62525
		int n = Integer.parseInt(s);
		System.out.println(n+25); //650
		n = Integer.parseInt("A"); //java.lang.NumberFormatException 
	}
}
