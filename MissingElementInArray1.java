package week2.day1;

import java.util.Arrays;

public class MissingElementInArray1 {
	public static void main(String[] args) {
		//declare the array values
		int[] num= {2,5,6,8,9,1,3,4};
		//sort the given array values by using sort method
		Arrays.sort(num);
		// declare the variable j as 0
		int j=0;
		//initialize the i value as 0
		//iterate the values
		for(int i=0;i<num.length;i++){
			//add 1 with j value
			j=j+1;
//compare the num[i] and j values, the given two values are not equal and execute if condition
			if(num[i]!=j) {
				//print j
			System.out.println(j);
			//break the loop
			break;
			}
		}	
		
	}

	}



