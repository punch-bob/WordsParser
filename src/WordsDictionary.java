package src;

import java.util.*;


public class WordsDictionary 
{    
    public static Set<Pair<String, Integer>> sortDictionary(List<String> listOfWords)
    {
        Set<Pair<String, Integer>> dictionary = new TreeSet<>(new FrequencyComparator());
        for (String word: listOfWords)
        {
            int freq = Collections.frequency(listOfWords, word);
            Pair<String, Integer> newWord = new Pair<String, Integer>(word, freq);
            dictionary.add(newWord);
            //System.out.println(newWord.getKey());
        }
        return dictionary;
    }
}
