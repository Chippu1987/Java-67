package co.edureka.except;

public class InvalidAgeException extends Exception
{
 InvalidAgeException(){}
 
 InvalidAgeException(String msg){
	 super(msg);
 }
}
