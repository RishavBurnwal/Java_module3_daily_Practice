package com.jspiders.filehandling;
import java.io.IOException;
import java.io.PrintWriter;

public class Mainclass10 {
	public static void main(String[] args) {
		PrintWriter ref = null;
		try {
			ref = new PrintWriter("C:/File_Handling/FILEIO/Practice.txt");
			ref.println("TCS");
			ref.println("Infosys");
			ref.println("Wipro");
			ref.println(65); // doesn't give unicode value
			ref.flush();
			System.out.println("Writing Completed");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			ref.close();
		}
	}

}
