package src;

import java.util.*;

public class CSVParser 
{
    public static void parseFile(String inputFilename, String outputFilename)
    {
        List<String> text = FileReciter.readFile(inputFilename);
        Set<Pair<String, Integer>> dictionary = WordsCounter.countWordsFrequency(text);
        Set<Pair<String, Integer>> sortedDictionary = DictionarySorter.sortDictionary(dictionary);
        CSVFileWriter.writeFile(outputFilename, sortedDictionary, text.size());
    }
}
    
