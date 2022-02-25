import java.util.*;
import src.*;

public class Main 
{
   public static void main(String[] args) 
   {
      List<String> text = FileReciter.readFile("in.txt");
      Set<Pair<String, Integer>> dictionary = WordsCounter.countWordsFrequency(text);
      SortedSet<Pair<String, Integer>> sortedDictionary = DictionarySorter.sortDictionaryByFrequency(dictionary);
      CSVFileWriter.writeFile("out.csv", sortedDictionary, text.size());
   }
}