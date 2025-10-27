package com.jspiders.filehandling;
import java.io.File;

public class Mainclass6 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO");
		String[] arr = ref.list();  
		for(int i=0; i<arr.length; i++) {
			File obj = new File(ref, arr[i]); //2nd file object need to be created to go inside the given address
			boolean bool = obj.isFile();  
			if (bool == true) {
				System.out.println(arr[i]);
			}
		}
	}
}

// isFile() --> this method is used to check if the file is assigned to file type entries or a folder type type entries 