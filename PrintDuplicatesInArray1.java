package week2.day1;

import java.util.Arrays;

public class PrintDuplicatesInArray1 { 
	public static void main(String[] args) {
		//declare the array variable 'a'
		  int[] a= {11,22,33,44,55,66,22,77,11};
		  //sort the array vale
		  Arrays.sort(a);
		  //initialize the i as 0
		  //iterate the values
		  for(int i=0;i<a.length;i++) {
			  //initialize the j as i+1
			  //iterate the values
			  for(int j=i+1;j<a.length;j++) {
				  //apply if condition
				  //compare a[i] and a[j] value is equal and execute if condition
				  if(a[i]==a[j]) {
					  //print a[i]
					  System.out.println(a[i]);
				  }
			  }
		  }
		
	}
}
	


