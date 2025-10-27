package com.jspiders.filehandling;
import java.io.File;

//Deleting File/Folder
public class Mainclass3 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO", "Demo.txt");
		boolean bool = ref.exists();
		if(bool == true) {
			ref.delete();  // Deleted by this method will delete the file/folder permanantly
			System.out.println("Delete Completed");
		}
		else {
			System.err.println("File/Folder not found");
		}
	}
}

// delete() --> used to perform delete operation for File/Folder both