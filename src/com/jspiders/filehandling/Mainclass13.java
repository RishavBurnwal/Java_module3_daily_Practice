package com.jspiders.filehandling;
import java.io.File;

public class Mainclass13 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO/obito.txt");
		boolean flag = ref.exists();
		if(flag == true) {
			System.out.println("Readable : "+ ref.canRead());
			System.out.println("Writable : "+ ref.canWrite());
			System.out.println("Executable : "+ ref.canExecute());
		}
	}

}
