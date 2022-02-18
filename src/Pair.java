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

    public K getKey()
    {
        return this.first;
    }

    public V getValue()
    {
        return this.second;
    }

    public void setValue(V newValue)
    {
        this.second = newValue;
    }
}