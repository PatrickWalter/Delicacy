package patrick.timmy.delicious.snails.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//Load data from settings file
		System.out.println("Loading data from settings file...");
		File settingsFile = new File("settings.dat");
		String settings = "";
		
		try{
			Scanner sc = new Scanner(settingsFile);
			while(sc.hasNextLine()){
				settings = settings + sc.nextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found. Likely does not exist");
			System.out.println("Creating new settings file...");
			try {
				settingsFile.createNewFile();
			} catch(IOException e2) {
				e2.printStackTrace();
				System.out.println("You done goofed");
			}
		}
		
		try{
			
		} catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("invalid arguments");
		}
		
		
	}

}

class Dog {
	
}
