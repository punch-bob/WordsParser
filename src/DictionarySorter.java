import java.util.*;


public class DictionarySorter 
{    
    public static SortedSet<Pair<String, Integer>> sortDictionaryByFrequency(Set<Pair<String, Integer>> dictionary)
    {   
        TreeSet<Pair<String, Integer>> sortedDictionary = new TreeSet<>(new ResortComparator());
        sortedDictionary.addAll(dictionary);
        return sortedDictionary;
    }
}
