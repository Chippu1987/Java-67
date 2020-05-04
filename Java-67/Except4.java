class Except4 
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
		catch(Exception ex)
		{
			System.out.println("Exception Occured!");
			System.out.println("Message: "+ ex.getMessage());
			System.out.println();
			System.out.println(ex.toString());
			System.out.println();
			ex.printStackTrace(); //toString()+call stack
			System.out.println();

			if(ex instanceof ArrayIndexOutOfBoundsException){
				System.out.println("INVALID ARRAY INDEX: "+ ex.getMessage());
			}
		}

		System.out.println("** DONE **");
	}
}
