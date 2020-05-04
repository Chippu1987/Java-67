class Except3 
{
	public static void main(String[] args) 
	{	
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println(a+" / "+b+" = "+c);
		}
		catch(ArithmeticException aex)
		{
			System.out.println("Cannot divide a number by zero!");
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Please provide min 2 cmd args");
		}
		catch(NumberFormatException ex){
			System.out.println("Please provide numbers as cmd args");
		}
		System.out.println("** DONE **");
	}
}
