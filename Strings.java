//Purpose: This program prompts the user for two strings and attempts to identify if
//the second is a substring of the first
//Programmer: Harman Dhami
//Class: INFO 2313 A12
//Date: February 10, 2021
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asking user to enter 2 strings
		System.out.print("Please enter the first string: ");
		String s1 = input.next();
		
		System.out.print("Please enter the second string: ");
		String s2 = input.next();
		
		//Check if the second string is a substring of the first string
		int num= s1.indexOf(s2);
		
		//Display output 
		if (num == -1) 
			System.out.print("The second string is not a substring of string one");
			else
				System.out.print("The second string is a substring of the first string");
		
		
		

	}

}
