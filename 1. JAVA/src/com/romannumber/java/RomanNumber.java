package com.romannumber.java;

import java.util.Scanner;

public class RomanNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Roman Number: ");
		String str = scan.nextLine();
		RomanNumber obj = new RomanNumber();
		System.out.println("The Integer value of given Roman number is: " + obj.romanToInt(str));
	}

	int NumValue(char rom) {
		if (rom == 'I')
			return 1;
		if (rom == 'V')
			return 5;
		if (rom == 'X')
			return 10;
		if (rom == 'L')
			return 50;
		if (rom == 'C')
			return 100;
		if (rom == 'D')
			return 500;
		if (rom == 'M')
			return 1000;
		return -1;
	}

	int romanToInt(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int s1 = NumValue(str.charAt(i));
			if (i + 1 < str.length()) {
				int s2 = NumValue(str.charAt(i + 1));
				if (s1 >= s2) {
					sum = sum + s1;
				} else {
					sum = sum - s1;
				}
			} else {
				sum = sum + s1;
			}
		}
		return sum;
	}
}