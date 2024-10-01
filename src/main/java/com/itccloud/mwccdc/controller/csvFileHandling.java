package com.itccloud.mwccdc.controller;


import java.io.*;
import java.util.*;


//This is the same csvFilkeHandling page we used in the second homework which i just transferred over to the mwccdc project. 

public class csvFileHandling {
	
	public static void main(String[] args) throws IOException {
		
		
		//Had to change this back to call the readCSV() function but this was about all i changed here
		readCSV();
		
		return;
		
	}

	static List<personObject> readCSV() throws FileNotFoundException, IOException {
		
		List<personObject> ret = new ArrayList<personObject>();
		String root = "/Users/texteditor/Desktop/";
		String filePath = root + "persons.csv";
		
		FileReader reader = new FileReader(filePath);
		BufferedReader bReader = new BufferedReader(reader);
		
		String line = "";
		while((line = bReader.readLine()) != null) {
			
			
			String[] split = line.split(",");
			
			personObject person = new personObject(split[0], split[1], split[2], split[3]);
			ret.add(person);
			System.out.println(person);
			
		}
	
		//This part might be in the wrong spot, the 'bReader.close()' but this did the trick when I put it here
		bReader.close();
		return ret;
		
	}

	
	

}