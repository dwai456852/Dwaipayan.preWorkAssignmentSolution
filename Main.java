package in.greatlearning.preassessment.javaprog;

import java.util.Scanner;

// This portion of the code contains all the functionalities.

public class Main {
	int num;

// This method checks a number is palindrome  or not. 

	public void checkPalindrome(int num) {
		this.num = num;
		int sum = 0;
		int reverse = 0;
		int org = num;
		while (num > 0) {
			reverse = num % 10;
			sum = (sum * 10) + reverse;
			num /= 10;
		}
		if (org == sum) {
			System.out.println("\n"+ org + " IS A PALINDROME.\n");
			System.out.println(
					"KINDLY VISIT OTHER FEATURES\n" + "OR\n" + "IF YOU WISH YOU MAY EXIT BY ENTERING---> 0\n ");
		} else {
			System.out.println("\n"+ org + " IS NOT A PALINDROME.\n");
		System.out.println(
				"KINDLY VISIT OTHER FEATURES\n" + "OR\n" + "IF YOU WISH YOU MAY EXIT BY ENTERING---> 0\n ");
		}
	}

//	This method prints star pattern for a given input.

	public void printPattern(int num) {
		this.num = num;
		int i, j;
		for (i = 0; i < num; i++) {
			for (j = i; j < num; j++) {
				System.out.print("*" + "");
			}
			System.out.println();
		}
		System.out.println(
				"KINDLY VISIT OTHER FEATURES\n" + "OR\n" + "IF YOU WISH YOU MAY EXIT BY ENTERING---> 0\n ");
	}

// This method checks that a number is prime or not.	

	public void checkPrimeNumber(int num) {
		this.num = num;
		boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println("\n" + num + " IS A PRIME NUMBER.\n");
			System.out.println(
					"KINDLY VISIT OTHER FEATURES\n" + "OR\n" + "IF YOU WISH YOU MAY EXIT BY ENTERING---> 0\n ");
		}
		else {
			System.out.println("\n" + num + " IS NOT A PRIME NUMBER.\n");
			System.out.println(
					"KINDLY VISIT OTHER FEATURES\n" + "OR\n" + "IF YOU WISH YOU MAY EXIT BY ENTERING---> 0\n ");
		}
	}

// This method prints fibonacci series for a given input.

	public void printFibonacciSeries(int num) {
		this.num = num;
		int first = 0, second = 1, sum = 0;
		System.out.println("\nTHE FIBONACCI SERIES IS");
		System.out.print(first + " " + second + " ");
		for (int i = 2; i < num; i++) {
			sum = first + second;
			first = second;
			second = sum;
			System.out.print(sum + " ");
		}
		System.out.println("\n");
		System.out.println(
				"KINDLY VISIT OTHER FEATURES\n" + "OR\n" + "IF YOU WISH YOU MAY EXIT BY ENTERING---> 0");
	}

	public static void main(String[] args) { // main method.

		Main obj = new Main();
		int choice, value;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n***** WELCOME TO JAVA LOGIC *****");
		System.out.println("---------------------------------");
		System.out.println("*>FOR PALINDROME CHECK PLEASE ENTER---> 1 \n"
				+ "*>FOR PRINTING * PATTERN PLEASE ENTER---> 2 \n" + "*>FOR PRIME NUMBER CHECK PLEASE ENTER---> 3 \n"
				+ "*>FOR PRINTING FIBONACCI SERIES PLEASE ENTER---> 4 \n"
				+ "*>TO EXIT FROM THE CONSOLE PLEASE ENTER---> 0 \n");

		do { // do-while loop.

			System.out.println(">>>>ENTER OPTION<<<<");
			choice = sc.nextInt();

			switch (choice) { // switch case functionality
			case 0: {
				System.out.println("TERMINATED SUCCESSFULLY\n");
				System.out.println("*****THANK YOU*****");
			}
				break;
			case 1: {
				System.out.println("PLEASE ENTER YOUR PREFERRED NUMBER\n");
				value = sc.nextInt();
				obj.checkPalindrome(value);
			}
				break;
			case 2: {
				System.out.println("PLEASE ENTER YOUR PREFERRED NUMBER\n");
				value = sc.nextInt();
				obj.printPattern(value);
            }
				break;
			case 3: {
				System.out.println("PLEASE ENTER YOUR PREFERRED NUMBER\n");
				value = sc.nextInt();
				obj.checkPrimeNumber(value);
			}
				break;
			case 4: {
				System.out.println("PLEASE ENTER YOUR PREFERRED NUMBER\n");
				value = sc.nextInt();
				obj.printFibonacciSeries(value);
				System.out.println("\n");
			}
				break;
			default:
				System.out.println("\n__INVALID INPUT__\n\n" + "__PLEASE PROVIDE VALID OPTION__\n");

			}

		} while (choice != 0);

		sc.close();
	}

}
