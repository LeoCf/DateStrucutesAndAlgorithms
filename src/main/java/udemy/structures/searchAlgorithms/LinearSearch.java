package udemy.structures.searchAlgorithms;

/**
 *  Linear search algorithm
 *  easy algorithm
 */
public class LinearSearch {

    public static int searchNumber(int[] input, int number){
        for(int i = 0; i< input.length; i++){
            if(input[i] == number )
                return i;

        }
        return -1;
    }

}
