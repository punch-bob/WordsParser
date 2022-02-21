import java.util.*;
import src.*;

public class Main 
{
   public static void main(String[] args) 
   {
      List<String> text = FileReciter.readFile("in.txt");
      Set<Pair<String, Integer>> dictionary = WordsCounter.countWordsFrequency(text);
      TreeSet<Pair<String, Integer>> sortedDictionary = (TreeSet<Pair<String, Integer>>)DictionarySorter.sortDictionaryByFrequency(dictionary);
      CSVFileWriter.writeFile("out.csv", sortedDictionary, text.size());
   }
}