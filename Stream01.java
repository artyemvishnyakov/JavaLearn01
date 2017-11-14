package ua.com.primocollect22;

import java.util.ArrayList;

public class Stream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ai = new ArrayList<>();
		
		ai.add(1);
		ai.add(2);
		ai.add(3);
		ai.add(4);
		ai.add(5);
		
		Integer sum = ai.stream().filter(e->e%2==0).reduce((s1,s2)->(s1+s2)).orElse(0);
		Integer ii  = ai.stream().findFirst().orElse(0);
		System.out.println("Sum: " + sum + ", First: " + ii);
	}

}
