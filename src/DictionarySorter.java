package src;

import java.util.*;


public class DictionarySorter 
{    
    public static TreeSet<Pair<String, Integer>> sortDictionary(List<String> listOfWords)
    {
        Set<Pair<String, Integer>> dictionary = new TreeSet<>();
        dictionary = WordsCounter.countWordsFrequency(listOfWords);
        TreeSet<Pair<String, Integer>> sortedDictionary = new TreeSet<>(new PairComparator());
        sortedDictionary.addAll(dictionary);
        return sortedDictionary;
    }
}
