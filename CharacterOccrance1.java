package week2.day1;

public class CharacterOccrance1 {
	public static void main(String[] args) {
		//Declare the string value
				String input="Testleaf";
				//change string into charArray
				char[] name=input.toCharArray();
				//initialize the count variable as 0
				int count=0;
				//iterate the character
				for(int i=0;i<name.length;i++) {
					//check the condition if it is match,increase the count value
					if(name[i]=='e') 
						count++;
							
				}//print the count
				System.out.println(count);
				
				
	}

	}

