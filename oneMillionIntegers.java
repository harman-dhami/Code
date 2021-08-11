//Purpose: This program generates 1 million integers and stores the counts in an array
//Programmer: Harman Dhami
//Class: INFO 2313 A12
//Date: February 20, 2021
import java.util.Scanner;
public class oneMillionIntegers {
	

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int[] countNum = new int[10];
			int randomNum= 0;
			
			//For loop for generating 1 million random numbers
			for (int i= 0; i < 1000000; i++) { 
				randomNum = (int) (Math.random() * 10 +1);
				
			//if statements for counting occurrence of each number
			if (randomNum == 1) {
			countNum[0]++;}
			if (randomNum == 2) {
			countNum[1]++;}
			if (randomNum == 3) {
			countNum[2]++;}
			if (randomNum == 4) {
			countNum[3]++;}
			if (randomNum == 5) {
			countNum[4]++;}
			if (randomNum == 6) {
			countNum[5]++;}
			if (randomNum == 7) {
			countNum[6]++;}
			if (randomNum == 8) {
			countNum[7]++;}
			if (randomNum == 9) {
			countNum[8]++;}
			if (randomNum == 10) {
			countNum[9]++;}
			}
			
			//For loop for displaying the counts
			for (int j=0; j < countNum.length; j++)
				System.out.println("The count of index " +j+ " is: " +countNum[j] );
			
			//Output Identification
			System.out.println("This is written by Harman Dhami, INFO 2313 A12");
			
	}
	}
	}


	


