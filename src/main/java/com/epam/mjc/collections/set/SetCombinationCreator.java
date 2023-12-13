package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combinationOfSets = new HashSet<>(firstSet);
        combinationOfSets.retainAll(secondSet);
        combinationOfSets.removeAll(thirdSet);
        thirdSet.removeAll(firstSet);
        thirdSet.removeAll(secondSet);
        combinationOfSets.addAll(thirdSet);
        return  combinationOfSets;
    }
}
