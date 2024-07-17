package com.example.coupling_pratice;

public class BinarySearchImpl {
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int target) {
        int [] sortedNumber = sortAlgorithm.sort(numbers);

        //Search logic would be here
        return 3;
    }
}
