
public class Checkpoint {
public static void main(String[] args) {
	double[] numbers = {1.1, 4, 7.8, 9.2, 5.6, 6.9, 4.2};
	int[] n = {1 ,42 ,69, 34, 52, 420, 17, 70};
	
	System.out.println(contains(n, 1000));
	
//print(sort(numbers));	
	}


public static double[] sort(double[] array){
	while(checkSort(array) == false){	
		for(int i = 0; i<array.length-1;i++){
			if(array[i] > array[i+1]){
				double temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
			}
		}
	}
	return array;
}


public static boolean checkSort(double[] array){
	for(int i = 0 ; i<array.length-1;i++){
		if(array[i]>array[i+1]){
			return false;
		}
	}
	return true;
}


public static void print(double[] array){
	for(int i = 0; i<array.length; i++){
		System.out.println(array[i]);
	}
	
}

public static boolean contains(int[] ar, int num){
	for(int i =0; i<ar.length;i++){
		if(ar[i] == num){
			return true;
		}
	}
	return false;
}


}