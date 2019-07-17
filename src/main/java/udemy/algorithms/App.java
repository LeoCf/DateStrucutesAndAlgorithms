package udemy.algorithms;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		int[] array = { 4, 2, 3, 1, 10 };
		// SelectionSort.printArray(SelectionSort.selectionSort(array));
		ShellSort.shellSort(array);
		ShellSort.printArray(array);
		//MergeSort.mergeSort(array, 0, 5);
		//MergeSort.printArray(array);
		
		
	}
}
