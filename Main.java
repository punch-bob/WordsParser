import java.util.*;

import src.*;

public class Main 
{
   public static void main(String[] args) 
   {
        List<String> text = FileReciter.readFile("in.txt");
        Set<Pair<String, Integer>> dictionary = DictionarySorter.sortDictionary(text);
        CSVFileWriter.writeFile("out.csv", dictionary, text.size());
   }
}