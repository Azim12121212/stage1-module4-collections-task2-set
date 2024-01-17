package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combinationSet = new HashSet<>();

        System.out.println("firstSet : " + firstSet);
        System.out.println("secondSet : " + secondSet);
        System.out.println("thirdSet : " + thirdSet);
        System.out.println();

        if (firstSet.isEmpty() && secondSet.isEmpty() && thirdSet.isEmpty()) {
        } else {
            Set<String> firstAndSecondSet = new HashSet<>();

            for (String s1: firstSet) {
                for (String s2: secondSet) {
                    if (s1.equals(s2)) {
                        firstAndSecondSet.add(s1);
                    }
                }
            }
            System.out.println("firstAndSecondSet : " + firstAndSecondSet);

            if (thirdSet.isEmpty()) {
                combinationSet.addAll(firstAndSecondSet);
            } else {
                Set<String> tempSet = new HashSet<>();

                for (String s3: thirdSet) {
                    for (String s1: firstSet) {
                        if (s3.equals(s1)) {
                            tempSet.add(s3);
                        }
                    }
                }
                for (String s3: thirdSet) {
                    for (String s2: secondSet) {
                        if (s3.equals(s2)) {
                            tempSet.add(s3);
                        }
                    }
                }
                System.out.println("tempSet : " + tempSet);
                thirdSet.removeAll(tempSet);
                combinationSet.addAll(thirdSet);
                combinationSet.addAll(firstAndSecondSet);
            }
        }


//
//        for (String s: set) {
//            for (String s3: thirdSet) {
//                if (s.equals(s3)) {
//                    set2.add(s);
//                }
//            }
//        }
//        System.out.println("Unique elements from oneTwoSet + thirdSet (uniqueSet2) : " + set2);
//
//        set.addAll(thirdSet);
//        System.out.println("oneTwoSet + thirdSet : " + set);
//        set.removeAll(set2);
//
//        set2.clear();


        return combinationSet;
    }
    public static void main(String[] args) {
        SetCombinationCreator setCombinationCreator = new SetCombinationCreator();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        set1.add("Java");
        set1.add("SortedSet");
        set1.add("Map");
        set1.add("Collections");
        set1.add("Iterable");
        set1.add("Set");
        set1.add("NavigableSet");
        set2.add("Queue");
        set2.add("SortedSet");
        set2.add("NavigableSet");
        set2.add("List");
        set2.add("Set");
        set2.add("Iterator");
        set2.add("Comparator");
        set3.add("SortedSet");
        set3.add("NavigableSet");
        set3.add("Set");
        System.out.println("Final combination set is : " + setCombinationCreator.createSetCombination(set1, set2, set3));
    }
}
