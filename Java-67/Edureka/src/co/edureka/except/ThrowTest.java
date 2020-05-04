package co.edureka.except;

import java.io.IOException;

class Edureka
{
 void getCourseDetails(String c_name) 
 {
   System.out.println("Syllabus | "+ c_name);
   //throw new ArithmeticException();
   throw new ArithmeticException("cannot divide by 0");
   /*try {
	   throw new InterruptedException();
   }catch(Exception ex) {}*/
 }
 
 void method() throws InterruptedException,IOException {
	 System.out.println("method logic!");
 }
}

public class ThrowTest 
{
 public static void main(String[] args) 
 {		
   Edureka edu = new Edureka();
   try {
	   edu.getCourseDetails("Java");
   }
   catch(Exception ex) {
	   System.out.println("Message: "+ ex.getMessage());
	   System.out.println(ex.toString());
   }
 }
}