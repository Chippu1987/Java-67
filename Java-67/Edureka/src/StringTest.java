
public class StringTest 
{
	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		System.out.println(s1 == s2); //true
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println(s3 == s4); //false
		
		System.out.println(s1);
		//s1.concat("Blr");
		s1 = s1.concat("Blr");
		System.out.println(s1);
	}

}
