package co.edureka.util;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Bank 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 HashMap<String,Float> bank = new HashMap<String,Float>();
	 System.out.println(bank.put("Sunil", 15000f)); //null
	 System.out.println(bank.put("Sunil", 11500.5f)); //15000.0
	 bank.put("Anil",25000f);
	 bank.put("Naveen",45000f);
	 bank.put("Rahul",45500f);
	 System.out.println(bank);
	 
	 float bal = bank.get("Sunil");
	 System.out.println("A/C Balance of Sunil = "+ bal);
	 bal = bal + 1500.5f;
	 bank.put("Sunil",bal);
	 System.out.println(bank);
	 
	 Set<String> names = bank.keySet();
	 System.out.println("A/C Holders = "+ names);
	 
	 Set<Map.Entry<String,Float>> entries = bank.entrySet();
	 Iterator<Map.Entry<String,Float>> it = entries.iterator();
	 while(it.hasNext())
	 {
		 Map.Entry<String,Float> entry = it.next();
		 String key = entry.getKey();
		 Float value = entry.getValue();
		 System.out.println(key+" : "+value);
		 Thread.sleep(2000);
	 }
	 
	 bank.put(null,null);
	 System.out.println(bank);
 }
}