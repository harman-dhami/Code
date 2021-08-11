//Purpose: This program generates the sum of the last column in the matrix
//Programmer: Harman Dhami
//Class: INFO 2313 A12
//Date: February 22, 2021
public class Matrix {

	public static void main(String[] args) {
		//Declaration and Initialization of array
		int [] [] array2D = {
				{4, 13, 7, 45, 3, 76},
				{5, 34, 9, 44, 32, 89},
				{12, 16, 5, 4, 67, 5},
				{85, 99, 3, 2, 4, 46},
				{1, 1, 45, 43, 2, 10},
				{23, 44, 5, 6, 44, 22},
		};
		
		//Calling method 
		int sum = sumLastColumn(array2D);
		
		//Displaying sum in the output
		System.out.println("The sum of the last column is: " +sum);
		
		System.out.print("This is written by Harman Dhami");
	}
	
	//Method for calculating sum for last column
	public static int sumLastColumn(int [] [] array2D) {
		int sum = 0;
		for (int col = 0; col < array2D[0].length; col++) {
			sum = 0;
			for (int row =0; row < array2D.length; row++)
				sum += array2D[row][col];
	}
		return sum;	
}	
}