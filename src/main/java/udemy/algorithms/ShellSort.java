package udemy.algorithms;


//Semelhante ao selectionSort mas com gap
public class ShellSort {

	public static int[] shellSort(int array[]) {

		for (int gapValue = 3; gapValue > 0; gapValue /= 2) {
			for (int i = gapValue; i < array.length; i++) {
				int newElement = array[i];
				int j = i;

				while (j >= gapValue && array[j - gapValue] > newElement) {
					array[j] = array[j - gapValue];
					j -= gapValue;
				}
				array[j] = newElement;
			}
		}

		return array;
	}
	
	public static void printArray(int array[]) {
		for(int i =0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
