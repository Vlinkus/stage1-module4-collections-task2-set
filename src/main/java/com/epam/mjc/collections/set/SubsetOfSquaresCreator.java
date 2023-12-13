package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> newTreeSet = new TreeSet<>();
        sourceList.forEach(n -> newTreeSet.add(n*n));
        return newTreeSet.stream()
                    .filter(x -> x >= lowerBound && x <= upperBound)
                    .collect(Collectors.toSet());
    }
}
