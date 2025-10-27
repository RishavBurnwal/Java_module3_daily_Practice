package com.jspiders.filehandling;
import java.io.File;

public class Mainclass7 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO");
		String[] arr = ref.list();  
		for(int i=0; i<arr.length; i++) {
			File obj = new File(ref, arr[i]);
			boolean bool = obj.isDirectory();
			if (bool == true) {
				System.out.println(arr[i]);
			}
		}
	}
}

//isDirectory() --> this method is used to check if the Directory/Folder is assigned to Folder type entries or a file type entries 