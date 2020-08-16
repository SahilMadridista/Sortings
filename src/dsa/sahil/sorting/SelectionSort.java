package dsa.sahil.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] abc = {22,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex = abc.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			
			int largestIndex = 0;
			
			for(int i = 1;i<=lastUnsortedIndex;i++) {
				
				if(abc[i]>abc[largestIndex]) {
					largestIndex = i;
				}
			}
			
			swap(abc, largestIndex, lastUnsortedIndex);
			
		}

		for(int i = 0;i<abc.length;i++) {
			System.out.println(abc[i]);
		}
		

	}
	
	public static void swap(int[] array, int i, int j) {
		
		if(i==j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
			
	}

}
