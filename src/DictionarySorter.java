package src;

import java.util.*;


public class DictionarySorter 
{    
    private static Set<Pair<String, Integer>> countWordsFrequency(List<String> listOfWords)
    {
        TreeSet<Pair<String, Integer>> dictionary = new TreeSet<>(new PairKeyComparator());
        for (String word: listOfWords)
        {
            Pair<String, Integer> newCandidate = new Pair<String, Integer>(word, 1);
            Pair<String, Integer> wordInSet = dictionary.ceiling(newCandidate);
            if (wordInSet != null && wordInSet.getKey().equals(newCandidate.getKey()))
            {
                wordInSet.setValue(wordInSet.getValue() + 1);
            }
            else
            {
                dictionary.add(newCandidate);
            }
        }
        return dictionary;
    }

    public static Set<Pair<String, Integer>> sortDictionary(List<String> listOfWords)
    {
        Set<Pair<String, Integer>> dictionary = new TreeSet<>();
        dictionary = countWordsFrequency(listOfWords);
        Set<Pair<String, Integer>> sortedDictionary = new TreeSet<>(new PairComparator());
        sortedDictionary.addAll(dictionary);
        return sortedDictionary;
    }
}
