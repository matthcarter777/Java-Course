package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		BufferedReader br = null;
		List<String> output = new ArrayList<String>();
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		try {
			fr = new FileReader(strPath);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				String arr[] = line.split(",");
				Double value = Double.parseDouble(arr[1]);
				int qt = Integer.parseInt(arr[2]);
				
				String lineData = arr[0] + "," + (value * qt);
				
				output.add(lineData);
				
				line = br.readLine();
			}
			
			String pathOutput = "c:\\report\\out\\summary.csv";
						
			BufferedWriter bw = new BufferedWriter(new FileWriter(pathOutput, true));
			
			for (String data : output) {
				System.out.println(data);
				bw.write(data);
				bw.newLine();
			}
			
			bw.close();
			sc.close();
 		} catch (IOException e) {
 			System.out.println("Error: " + e.getMessage());
 		} finally {
 			
 			try {
 	 			if (br != null ) {
 	 				br.close();
 	 			}
 	 			
 	 			if (fr != null) {
 	 				fr.close();
 	 			}
 			} catch (IOException e) {
 				e.printStackTrace();
 			}
 		}
	}

}