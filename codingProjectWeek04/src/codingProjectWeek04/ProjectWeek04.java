package codingProjectWeek04;

import java.util.Arrays;
import java.util.List;

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
		 
		 int[] ages2 = new int[9];
		 
		 
	// 2 Names 
		 
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLength = 0;
		int[] nameLengths = new int[names.length];
		
		for(String name : names) {
			totalLength += name.length();
			System.out.println(name);
		}
		 int[] nameLength = new int[names.length];
		 for(int i = 0; i < names.length; i++) {
			 nameLengths[i] = names[i].length();
			 System.out.println(Arrays.toString(nameLengths));
				 
		 }
	double average =(double) totalLength / names.length; 
		 System.out.println("Average Number of Letters: " + average);		 
		 
	// 3 To access the first element of an array, use arrayName[0]; 0 is the first value, not 1
	// 4  To access the last element of an array, use array.length-1
		 
	StringBuilder fullNames = new StringBuilder(); 
	
	for(String name: names) {
		fullNames.append(name).append(" ");
	
	}
	
	
	}
	
	 public String repeatWord(String word, int n) {
		 return word.repeat(n);
		 
	 }
		 
	
	public String getFullName(String firstName, String lastName){
		return firstName + " " + lastName;
		
	}
/*	// question 9 
	public boolean isSumGreaterThan100(int[] arr() {
		int sum = 0;		
		for(int num : arr()) {
			sum =+num;
		}
		return sum > 100;
	}*/
	
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

	private static double average(double[] array) {
	    double sum = 0;
	    for (double num : array) {
	        sum += num;
	    }
	    return sum / array.length;
	}

	
	public boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
		return isHotOutside && moneyInPocket > 10.50;	
	}
	
	public static void question13Method() {
		
		
	}
}

		
	

