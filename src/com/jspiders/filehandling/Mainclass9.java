package com.jspiders.filehandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Mainclass9 {
	public static void main(String[] args) {
		BufferedWriter ref = null;
		try {
			ref = new BufferedWriter(new FileWriter("C:/File_Handling/FILEIO/Sample.txt",true));
			ref.write("Rishav");
			ref.newLine();
			ref.write("Developer");
			ref.newLine();
			char[] ch = {'J', 'a', 'v', 'a'};
			ref.write(ch);
			ref.newLine();
			ref.write(65); //gives UNICODE value
			ref.flush();
			ref.close();
			System.out.println("Writing Completed");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				ref.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
