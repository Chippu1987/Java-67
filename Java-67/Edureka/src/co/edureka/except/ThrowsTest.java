package co.edureka.except;

import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args)throws IOException,InterruptedException {
		Edureka edu = new Edureka();
		edu.method();
		try {
			edu.method();
		}catch(Exception ex) {}
	}

}
