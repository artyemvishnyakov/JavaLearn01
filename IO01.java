package ua.com.primocollect22;

import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class IO01 {
	
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		TreeSet<String> dirArray = new TreeSet<>();
		TreeSet<String> fileArray = new TreeSet<>();
		
		for (File r:roots) {
			System.out.println(r.toString());
			File[] listFiles = r.listFiles();
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
		}
		
		Scanner in = new Scanner(System.in);
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
		}
		
	}
}
