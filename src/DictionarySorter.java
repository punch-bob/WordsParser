package src;

import java.util.*;


public class DictionarySorter 
{    
    public static TreeSet<Pair<String, Integer>> sortDictionary(Set<Pair<String, Integer>> dictionary)
    {   
        TreeSet<Pair<String, Integer>> sortedDictionary = new TreeSet<>(new PairComparator());
        sortedDictionary.addAll(dictionary);
        return sortedDictionary;
    }
}
