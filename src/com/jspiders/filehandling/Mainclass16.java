package com.jspiders.filehandling;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import com.jspiders.example.Contact;

import java.io.IOException;

public class Mainclass16 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:/File_Handling/FILEIO/repo.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Contact con = (Contact)ois.readObject();
		System.out.println(con.name);
		System.out.println(con.number);
		ois.close();
		fis.close();
	}

}