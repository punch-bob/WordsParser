package src;

public class Pair <K, V>
{
    private K first;      
    private V second;

    Pair(K first, V second)
    {
        this.first = first;
        this.second = second;
    }
 
    // @Override
    // public boolean equals(Object o)
    // {
    //     if (this == o) 
    //     {
    //         return true;
    //     }
 
    //     Pair<?, ?> pair = (Pair<?, ?>) o;
 
    //     if (!first.equals(pair.first)) 
    //     {
    //         return false;
    //     }
    //     return second.equals(pair.second);
    // }

    // @Override
    // public int hashCode()
    // {
    //     return first.hashCode() + second.hashCode();
    // }

    public K getKey()
    {
        return this.first;
    }

    public V getValue()
    {
        return this.second;
    }

    public void setKey(K newKey)
    {
        this.first = newKey;
    }

    public void setValue(V newValue)
    {
        this.second = newValue;
    }
}