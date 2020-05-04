package org.tempuri;

import java.math.BigDecimal;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) throws Exception{
		ConverterLocator locator = new ConverterLocator(); 
		ConverterSoap ser = locator.getConverterSoap();
		
		String from = "USD";
		String to = "INR";
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DATE, 13);
		
		BigDecimal resp = ser.getConversionRate(from, to, date);
		System.out.println("1 USD = "+resp+" INR");
	}
}
