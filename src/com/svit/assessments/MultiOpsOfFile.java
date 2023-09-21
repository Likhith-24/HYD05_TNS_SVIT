package com.svit.assessments;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;  

public class MultiOpsOfFile {
	void create(){
		try {
				File MultiOps = new File("MultiOps_OfFile.txt");
				if (MultiOps.createNewFile()) {
					System.out.println("File created: " + MultiOps.getName());
				}
				else {
					System.out.println("File already exists.");
					System.out.println(MultiOps.getAbsolutePath());
				}
		} 
		catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}

	void write(){
		try {
				FileWriter myInfo = new FileWriter("MultiOps_OfFile.txt");
				myInfo.write("All the contents mentioned is written by Java Concepts");
				myInfo.close();
				System.out.println("Successfully wrote to the file.");
		    }
			catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
		    }
	}
		
	/**
	 * 
	 */
	void read() {
		try {
		      	File MultiOps = new File("MultiOps_OfFile.txt");
		      	Scanner FileReader = new Scanner(MultiOps);
		      	while (FileReader.hasNextLine()) {
		      		String data = FileReader.nextLine();
		      		System.out.println(data);
		      	}
		      	FileReader.close();
		    }
		catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
	    }
	}
		
	void delete() {
		File MultiOps = new File("MultiOps_OfFile.txt");
		if (MultiOps.delete()) { 
			System.out.println("Deleted the file: " + MultiOps.getName());
		}
		else {
			System.out.println("Failed to delete the file.");
		} 
	}
	
	public static void main(String[] args) {
		MultiOpsOfFile f1= new  MultiOpsOfFile();
		f1.create();
		f1.write();
		f1.read();
		f1.delete();
	}
}

