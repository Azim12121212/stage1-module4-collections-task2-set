package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> integerTreeSet = new TreeSet<>();

        Iterator<Integer> it = sourceList.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            integerTreeSet.add(num*num);
        }

        return integerTreeSet.subSet(lowerBound, upperBound+1);
    }
    public static void main(String[] args) {
        SubsetOfSquaresCreator subsetOfSquaresCreator = new SubsetOfSquaresCreator();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(-1);
        integerList.add(5);
        integerList.add(-7);
        integerList.add(4);
        integerList.add(6);
        integerList.add(-9);
        integerList.add(8);
        System.out.println(subsetOfSquaresCreator.createSubsetOfSquares(integerList, 25, 49));
    }
}
