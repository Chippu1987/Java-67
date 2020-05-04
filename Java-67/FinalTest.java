//final class A{
class A{
	//final A(){}
	final void display(){}
	void display(int n){}
}
class B extends A{
	//void display(){}
}

class FinalTest 
{
	final int n = 10; // instance variable
	public static void main(String[] args) 
	{
		final int n = 25; //local variable
		System.out.println(n);
		//n = 26; //CE
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 10; //CE
		System.out.println(obj.n);
	}
}
