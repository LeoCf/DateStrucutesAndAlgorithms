package udemy.algorithms;

//Divide array em sorted e unsorted
public class SelectionSort {

	public static int[] selectionSort(int array[]) {
		
		for(int lastUnsortedIndex = array.length-1;lastUnsortedIndex>0; lastUnsortedIndex--) {
			int largest = 0;
			
			for(int i=1; i<=lastUnsortedIndex; i++) {
				if(array[i]>array[largest]) {
					largest =i;
				}
			}
			
			swap(array,largest,lastUnsortedIndex);
		}
		return array;
	}
	
	public static void printArray(int array[]) {
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	
	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
