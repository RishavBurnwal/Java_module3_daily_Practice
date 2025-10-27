package com.jspiders.filehandling;
import java.io.File;

class Example{
	static void showFileProperties(File obj) {
		System.out.println("Location : "+ obj.getAbsolutePath());
		System.out.println("Length : "+ obj.length());
	}
}
public class Mainclass4 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO/Demo.txt");
		Example.showFileProperties(ref);
	}
}
