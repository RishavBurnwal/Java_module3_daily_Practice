package com.jspiders.filehandling;
import java.io.File;
import java.io.IOException;

//Creating File
public class Mainclass2 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO", "Demo.txt");
		boolean bool = ref.exists();
		if(bool == false) {
			try {
				ref.createNewFile();
				System.out.println("File Created");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.err.println("Alert : File/Folder already Exists");
		}
	}
}
