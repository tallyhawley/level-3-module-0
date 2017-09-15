package IntroToArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/Users/league/Desktop/level-3-module-0/src/IntroToArrayLists/file");
		
		try {
			Scanner scan = new Scanner(file);
			PrintWriter pw = new PrintWriter(file);
			pw.println("i wanna die");
			pw.println("i want: Death");
			pw.println("i dont know if u get it");
			pw.println("point is i wanna die");
			pw.close();
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("sorry man no file here");
		}
		
	}
}
