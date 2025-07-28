package codingProjectWeek04;

import java.util.Arrays;

public class ProjectWeek04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Age
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length -1] - ages[0]; 
	    System.out.println("Result: " + result);
		for( int i=0; i < ages[0] - ages.length ;i--) {
		 System.out.println(ages[i]);  
		}
		int sum = 0;
		for (int age : ages) {
		sum += age;
		double average = (double) sum / ages.length;
		
		 System.out.println("Average Age: " + average);
		}
		 int[] ages2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		 int result2 = ages2[ages2.length -1] - ages2[0];
		 for( int i=0; i <ages2[0] -ages.length ;i--) {
			 
		 }
		 System.out.println("Results 2: " + result2);
		
	// 2 Names 
	
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};	
		 int totalLength = 0;
		for(String name : names) {
			totalLength += name.length();
			System.out.println(name);
		}
		StringBuilder fullNames = new StringBuilder(); 
		
		for(String name: names) {
			fullNames.append(name).append(" ");
			System.out.println(fullNames);
		}
		 int[] nameLengths = new int[names.length];
		 for(int i2 = 0; i2 < names.length; i2++) {
			 nameLengths[i2] = names[i2].length();
			 System.out.println(Arrays.toString(nameLengths));
			}

		 
	double average =(double) totalLength / names.length; 
		 System.out.println("Average Number of Letters: " + average);		 
		 
	// 3 To access the first element of an array, use arrayName[0]; 0 is the first value, not 1
	// 4  To access the last element of an array, use array.length-1
		 
	
	}
	//question 7
	public static String repeatWord(String word, int n) {
		 return word.repeat(n);
		 
	 }
		 
	//question 8
	public static String getFullName(String firstName, String lastName){
		return firstName + " " + lastName;
		
	}
	// question 9 
	public static boolean isSumGreaterThan100(int[] arr) {
		int sum = 0;		
		for(int num : arr) {
			sum =+ num;
		}
		return sum > 100;
	}
	
	//question 10
	public static double averageTwo(double[] arr) {
		double sum = 0;
		for(double num : arr) {
			sum=+ num;
		}
		return sum/arr.length;

	}
	//question 11
	public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
	    double avg1 = average(array1);
	    double avg2 = average(array2);
	    return avg1 > avg2;
	}
	//question 12
	private static double average(double[] array) {
	    double sum = 0;
	    for (double num : array) {
	        sum += num;
	    }
	    return sum / array.length;
	}

	//question 13
	public boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
		return isHotOutside && moneyInPocket > 10.50;	
	}
	// question 13
	public static void daysInMonths() {
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < daysInMonth.length; i++) {
		}
	}
}

		
	

