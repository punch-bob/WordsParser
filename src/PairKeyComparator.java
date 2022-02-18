package src;

import java.util.*;

public class PairKeyComparator implements Comparator<Pair<String, Integer>>
{

    @Override
    public int compare(Pair<String, Integer> p1, Pair<String, Integer> p2) 
    {
        return p2.getKey().compareTo(p1.getKey());
    }
    
}
