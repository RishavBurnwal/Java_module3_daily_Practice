package com.jspiders.filehandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Mainclass15 {
	public static void main(String[] args) throws IOException{
		Contact con = new Contact("Crush#", 1234567891L);
		FileOutputStream fos = new FileOutputStream("C:/File_Handling/FILEIO/repo.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(con);
		System.out.println("Serialization Complete");
		oos.close();
		fos.close();
	}
}
