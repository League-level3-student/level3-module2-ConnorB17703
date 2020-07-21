package _00_Sorting_Algorithms;



public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise
static public boolean intArraySorted(int[] integers){
	for(int i = 0; i<integers.length-1; i++){
		if(integers[i]>integers[i+1]){
			return false;
			
		}
	}
	return true;
}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static public boolean doubleArraySorted(double[] d){
	for(int k= 0; k<d.length-1;k++){
		if(d[k]>d[k+1]){
			return false;
		}
	}
	
	return true;
	
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
static public boolean charArraySorted(char[] c){
	for(int l=0;l<c.length-1;l++){
		if(c[l]>c[l+1]){
			return false;
		}
	}
	return true;
}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)
static public boolean stringArraySorted(String[] s){
	for(int o=0; o<s.length-1; o++){
		int sign = s[o+1].compareTo(s[o]);
		if(sign < 0){
			return false;
		}
	}
	return true; 
}


}
