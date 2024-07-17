package com.example.coupling_pratice;

public class BinarySearchImpl {
    public int binarySearch(int[] numbers, int target) {
        BubbleSortAlgorithm sorter = new BubbleSortAlgorithm();
        int [] sortedNumber = sorter.sort(numbers);

        //Search logic would be here
        return 3;
    }
}
