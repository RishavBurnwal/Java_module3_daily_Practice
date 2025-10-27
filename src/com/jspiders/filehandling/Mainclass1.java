package com.jspiders.filehandling;
import java.io.File;

//Creating Folder
public class Mainclass1 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO");
		boolean bool = ref.exists();
		if(bool == false) {
			ref.mkdir();
			System.out.println("Folder Created");
		}
		else {
			System.err.println("Alert : File/Folder already Exists");
		}
	}
}

// mkdir() --> used to create a physical folder