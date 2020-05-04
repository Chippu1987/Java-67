package co.edureka.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations 
{
	public static void main(String[] args) 
	{
	 List<Integer> marks = new ArrayList<>();
	 marks.add(98);	//boxing
	 marks.add(85);
	 marks.add(76); marks.add(78); marks.add(93); marks.add(64);
	 
	 iterate1(marks);
	 separator();
	 iterate2(marks);
	 separator();
	 iterate3(marks);
	 separator();
	 iterate4(marks);
	 separator();
	 iterate5(marks);
	}
	
	static void iterate1(List<Integer> al)
	{
	 System.out.println("<<<iterate using a for loop with get() - only for List");	
	 for(int i=0;i<al.size();i++)
	 {
	  Integer n = al.get(i);
	  System.out.print(n+"   ");
	 }
	}
	
	static void iterate2(List<Integer> al)
	{
	 System.out.println("<<<iterate using enhanced for loop");	
	 for(Integer n : al)
	 {	  
	  System.out.print(n+"   ");
	 }
	}	
	
	static void iterate3(List<Integer> al)
	{
	 System.out.println("<<<iterate using java.util.Iterator");
	 Iterator<Integer> it = al.iterator();
	 while(it.hasNext())
	 {
	  Integer n = it.next();
	  System.out.print(n+"   ");
	 }
	}
	
	static void iterate4(List<Integer> al)
	{
 	 System.out.println("<<<iterate using java.util.ListIterator - only for List");
	 ListIterator<Integer> it = al.listIterator();
	 while(it.hasNext())
	 {
	  Integer n = it.next();
	  System.out.print(n+"   ");
	 }	
	 separator();
	 while(it.hasPrevious())
	 {
  	  Integer n = it.previous();
  	  System.out.print(n+"   ");
	 }
	}
	
	static void iterate5(List<Integer> data)
	{
 	  System.out.println("<<<iterate using java.util.Enumeration");
	  Enumeration<Integer> en = Collections.enumeration(data);
	  while(en.hasMoreElements())
	  {
		  Integer n = en.nextElement();
		  System.out.print(n+"   ");
	  }
	}
	
	static void separator() {
		System.out.println("\n");
		try {
			Thread.sleep(1500);
		}catch(Exception ex) {}
	}	
}
