import java.util.*;

public class PairKeyComparator<TKey extends Comparable<TKey>, TValue> implements Comparator<Pair<TKey, TValue>>
{
    @Override
    public int compare(Pair<TKey, TValue> p1, Pair<TKey, TValue> p2) 
    {
        return p2.getKey().compareTo(p1.getKey());
    }
}
