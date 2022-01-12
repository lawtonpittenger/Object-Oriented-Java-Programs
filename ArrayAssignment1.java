/*
 * Program Author: Lawton Pittenger
 * Assignment: HW 5 1D Array Assignment
 * Date: 03.9.2021
 * Purpose of Assignment: 
 * Student will demonstrate the ability to use a one-dimensional array.
 * Student will demonstrate the ability to sort and search arrays.
 * Student will demonstrate the ability to use methods.
 * 
 */
import java.util.Scanner;
import java.lang.Math;  
import java.util.Arrays;


public class ArrayAssignment1 {
	
	 static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	        	 for(int j=1; j < (n-i); j++){  
	        		 if(arr[j-1] > arr[j]){  
	        			 //swap elements  
	                     temp = arr[j-1];  
	                     arr[j-1] = arr[j];  
	                     arr[j] = temp;  
	    }}}
	                          
	                 }  
	static void fillArray(int arr[]) {
		for (int i = 0; i < 100; i++) {
			arr[i] = (int)(Math.random()*(100-1+1)+1);  ;
		}
	}
	 
	static void printUnsortedArray(int[] arr) {
		System.out.println("Elements in unsorted array:");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println(); 
	}
	
	static void printSortedArray(int[] arr) {
		System.out.println("Elements in sorted array:");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println(); 
	}
	
	static void searchArray(int arr[]) {
		System.out.println("\nPlease enter your option number:");
 		Scanner userInput = new Scanner (System.in);
 		int value = userInput.nextInt();
 		//perform a binary search on the array, to get the index of the search value
 		int index = Arrays.binarySearch(arr,value);
 		//If search value is not negative, the element is in the array.
 		if (index >= 0) {
 			System.out.println("Found");
 		}
 		//If search value is negative, the element is not in the array.
 		else
 			System.out.println("Value not found");
 		
	}
	
	
	static int countOccurrences(int arr[], int x) 
    { 
		int n = arr.length;
        int res = 0; 
        for (int i=0; i<n; i++) 
            if (x == arr[i]) 
              res++; 
        return res; 
    } 
	
	static float calculateAverage(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		float retVal = (float) (sum / 100.0);
		return retVal;
		
	}
	static int maxValue(int arr[]) {
		
		return arr[arr.length-1];
	}
	static int minValue(int arr[]) {
		
		return arr[0];
	}
	
	
	// Nice and clean main method
	public static void main(String[] args) {
		//Create an array of 100 integers.
		int arr[] = new int[100];  
		//Store 100 random integers (between 1 and 100) in the array.
		fillArray(arr);
		// Call method to print unsorted array
		printUnsortedArray(arr);
		// Sort array elements using bubble sort
        bubbleSort(arr);   
        // Call method to print sorted array
        printSortedArray(arr);
        // Call method to search the sorted array
        searchArray(arr);
        // Call method to count number of occurrences of each number.
        System.out.println("\nPrinting values from 1-100 and the number of occurrences of each value in array:");
        for (int i = 1; i < arr.length; i++)
        System.out.println(i + " occurs " + countOccurrences(arr, i) + " times");
        //Display the average of the numbers in the array.
        System.out.println("\nThe average of all the values in the array is: " + calculateAverage(arr));
        //Display the highest number in the array.
        System.out.println("\nThe highest value in the array is: " + maxValue(arr));
        //Display the lowest number in the array.
        System.out.println("\nThe lowest value in the array is: " + minValue(arr));
        
         
        
		
	}

}
