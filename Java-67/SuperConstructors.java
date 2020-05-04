class A{
	A(){
		System.out.println("class A constructor");
	}
}

class B extends A{
	B(){
		System.out.println("class B constructor");
	}
}

class SuperConstructors 
{
	public static void main(String[] args) 
	{
		B obj = new B();
	}
}
