package src;

import java.util.*;


public class DictionarySorter 
{    
    public static Set<Pair<String, Integer>> sortDictionaryByFrequency(Set<Pair<String, Integer>> dictionary)
    {   
        TreeSet<Pair<String, Integer>> sortedDictionary = new TreeSet<>(new ResortComparator());
        sortedDictionary.addAll(dictionary);
        return sortedDictionary;
    }
}
