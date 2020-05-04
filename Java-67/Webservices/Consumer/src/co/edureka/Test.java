package co.edureka;

public class Test {

	public static void main(String[] args) throws Exception
	{
	  NumsServiceLocator locator = new NumsServiceLocator();
	  Nums obj = locator.getNums();
	  
	  int x = 10, y=23;
	  System.out.println("Sum = "+ obj.addNum(x, y));
	  System.out.println("Diff = "+ obj.subNum(10.2f, 23.1f));
	}
}
