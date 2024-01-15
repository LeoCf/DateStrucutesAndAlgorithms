package udemy.structures.searchAlgorithms;

public  class BinarySearch {

    public static  int iterativeBinarySearch(int [] input, int value){
        int start = 0;
        int end = input.length-1;

        while(start < end){
            int midpoint = (start + end) /2;
            if(input[midpoint] == value){
                return midpoint;
            }
            else if (input[midpoint] < value){
                start = midpoint +1;
            }
            else {
                end = midpoint;
            }
        }
        return -1;
    }

}
