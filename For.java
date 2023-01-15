package test;

import java.util.ArrayList;

public class For {
	public static void main(String[] args) {
		int[] scores = {1, 5, 10};
		
		for(int score : scores) {
			System.out.println(score);
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		
		for(int number : numbers) {
			System.out.println(number);
		}
	}
}
