package src;

import java.io.*;
import java.util.*;

public class CSVFileWriter
{
    private static String makeCSVString(Pair<String, Integer> word, Integer totalWords)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(word.getKey());
        sb.append(";");
        sb.append(word.getValue());
        sb.append(";");
        sb.append((double)word.getValue() / totalWords * 100);
        sb.append("%");
        sb.append("\n");
        return sb.toString();
    }

    public static void writeFile(String filename, Set<Pair<String, Integer>> sortDictionary, Integer totalWords)
    {
        Writer out = null;
        try {
            out = new OutputStreamWriter(new FileOutputStream(filename));
            
            for(Pair<String, Integer> word: sortDictionary)
            {
                out.write(makeCSVString(word, totalWords));
            }
        }
        catch (IOException e) {
            System.err.println("Error while writing file: " + e.getLocalizedMessage());
        }
        finally {
            if (out != null) {
                try {
                    out.close();
                }
                catch (IOException e) {
                    e.printStackTrace(System.err);
                }
            }
        }
    }    
}
