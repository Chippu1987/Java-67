package co.edureka.util;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		 TreeMap<String,Float> bank = new TreeMap<String,Float>();
		 System.out.println(bank.put("Sunil", 15000f)); //null
		 System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
		 bank.put("Anil",25000f);
		 bank.put("Naveen",45000f);
		 bank.put("Rahul",45500f);
		 
		 bank.put("Rajesh", null);
		 bank.put(null,243435f);
		 System.out.println(bank);
	}

}
