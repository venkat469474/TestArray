package com.test.array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample1 {

	private static final String FILENAME = "C:\\Materials\\BigData\\Training\\Training_Practice\\Kafka\\sample.txt";
//	private static final String FILENAME = "https://s3-us-west-2.amazonaws.com/cdrrawdata/cdr1.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;

		while(true){
			System.out.println("looping");
			File dir=new File("C:\\Materials\\BigData\\Training\\Training_Practice\\Kafka\\cdr1\\");
			for(File file:dir.listFiles()){
				System.out.println(file.getName());
				if(!file.getName().contains("completed")){
					
				try {

					fr = new FileReader(FILENAME);
					br = new BufferedReader(fr);

					String sCurrentLine;

					br = new BufferedReader(new FileReader(FILENAME));

					while ((sCurrentLine = br.readLine()) != null) {
						System.out.println(sCurrentLine);				
					}

				} catch (IOException e) {

					e.printStackTrace();

				} finally {

					try {

						if (br != null)
							br.close();

						if (fr != null)
							fr.close();

					} catch (IOException ex) {

						ex.printStackTrace();

					}

				}
				file.renameTo(new File(file.getAbsolutePath().replace(".txt", "_completed.txt")));
			}
				
				
			}
//		
		}
		

	}

}
