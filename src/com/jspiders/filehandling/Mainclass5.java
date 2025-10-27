package com.jspiders.filehandling;
import java.io.File;

public class Mainclass5 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO");
		String[] arr = ref.list();  
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

// list() --> it will give all the entries(files/folders) in the given address