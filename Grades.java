package Assignments;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mark for Physics");
		int a = sc.nextInt();
		System.out.println("Enter mark for Math");
		int b = sc.nextInt();
		System.out.println("Enter mark for Chemistry");
		int c = sc.nextInt();
		int d = (a + b + c) / 3;
		char e = 'C';
		if (d > 70)
			e = 'A';
		if (d < 70 && d > 61)
			e = 'B';
		if (d < 61)
			e = 'C';
		System.out.println("Student average grade is: " + e);

		sc.close();

	}

}
