package src;

import java.util.*;

class PairComparator implements Comparator<Pair<String, Integer>>
{
    @Override
    public int compare(Pair<String, Integer> p1, Pair<String, Integer> p2) 
    {
        Integer cmp = p2.getValue() - p1.getValue();
        if (cmp == 0)
        {
            return p2.getKey().compareTo(p1.getKey());
        }
        else
        {
            return cmp;
        }
    }
}