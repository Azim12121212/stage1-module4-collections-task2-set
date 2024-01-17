package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integerHashSet = new HashSet<>();

        for (Integer i: sourceList) {
            Integer num = i;
            if (num%2==0) {
                while (num%2==0) {
                    integerHashSet.add(num);
                    num /= 2;
                }
                if (num%2!=0) {
                    integerHashSet.add(num);
                }
            } else {
                integerHashSet.add(num);
                integerHashSet.add(num*2);
            }
        }

        return integerHashSet;
    }
    public static void main(String[] args) {
        HashSetCreator hashSetCreator = new HashSetCreator();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(-1);
        integerList.add(3);
        integerList.add(8);
        integerList.add(-5);
        integerList.add(12);
        System.out.println(hashSetCreator.createHashSet(integerList));
    }
}
