package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> createdHashSet = new HashSet<>();
        sourceList.forEach( number -> {
                    createdHashSet.add(number);
                    if(number % 2 != 0){
                       createdHashSet.add(number*2);
                    } else {
                        while (number % 2 == 0) {
                            number /= 2;
                            createdHashSet.add(number);
                        }
                    }
                });
        return createdHashSet;
    }



}
