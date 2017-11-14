package ua.com.primocollect22;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class IO02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File[] roots = File.listRoots();
		TreeSet<File> listArray = new TreeSet<File>((f1,f2)->(f1.isDirectory()?(f1.getName().compareTo(f2.getName())):(f1.getName().compareTo(f2.getName()))));
		
		for (File r:roots) {
			listArray.clear();
			System.out.println(r.toString());
			File[] listFiles = r.listFiles();
			for (File lf:listFiles) {
				listArray.add(lf);
			}
			for (File la:listArray) {
				System.out.println("--" + la.getName());
			}
		}
		
		/*Scanner in = new Scanner(System.in);
		String userInput = "";
		while (!userInput.equalsIgnoreCase("exit")) {
			dirArray.clear();
			fileArray.clear();
			System.out.println("Enter catalog name: > ");
			userInput = in.nextLine();
			File[] listFiles = new File(userInput).listFiles();
			for (File lf:listFiles) {
				
				if (lf.isDirectory()) {
					dirArray.add(lf.getName());
				} else {
					fileArray.add(lf.getName());
				}
			}
			for (String da:dirArray) {
				System.out.println("--" + da);
			}
			for (String fa:fileArray) {
				System.out.println("--" + fa);
			}
		}*/
		
	}

}
