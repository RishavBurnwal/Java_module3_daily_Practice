package com.jspiders.filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class Mainclass8 {
	public static void main(String[] args) {
		FileWriter ref = null;
		try {
			ref = new FileWriter("C:/File_Handling/FILEIO/Example.txt", true);
			ref.write("Java");
			ref.write("\n");
			ref.write("Jspiders");
			ref.write("\n");
			char[] ch = {'T','i','g','e','r'};
			ref.write(ch);
			ref.write("\n");
			ref.write(97);
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
