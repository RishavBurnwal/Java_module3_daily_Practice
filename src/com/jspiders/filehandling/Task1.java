package com.jspiders.filehandling;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Task1 {
	public static void main(String[] args) {
		File ref = new File("C:/File_Handling/FILEIO");
		String[] arr = ref.list();
		File obj = new File(ref, "contents.txt");
		boolean flag = obj.exists();
		if(flag == false) {
			try {
				ref.createNewFile();
				System.out.println("File Created");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(obj);
			for(int i=0; i<arr.length; i++) {
				pw.println(arr[i]);
			}
			pw.flush();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			pw.close();
		}
		
	}

}
