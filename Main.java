import java.util.*;

import src.*;

public class Main 
{
   public static void main(String[] args) 
   {
        List<String> text = ReadFile.readFile("in.txt");
        Set<Pair<String, Integer>> dictionary = WordsDictionary.sortDictionary(text);
        WriteFile.writeFile("out.csv", dictionary, text.size());
   }
}