package src;

import java.util.*;

public class WordsCounter
{
    public static Set<Pair<String, Integer>> countWordsFrequency(List<String> listOfWords)
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
}
