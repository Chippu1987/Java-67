package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception
	{
		//FileOutputStream fout = new FileOutputStream("src/edureka.txt");
		FileOutputStream fout = new FileOutputStream("src/edureka.txt",true); //true-appending mode
		
		String str = "edureka is into the service of providing online training 24 x 7";
		byte[] b = str.getBytes(); //to convert String to byte[]
		fout.write(b);
		
		System.out.println("file created!");
		fout.close();
	}
}
