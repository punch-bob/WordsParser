package src;

import java.io.*;
import java.util.*;

public class WriteFile
{
    public static void writeFile(String filename, Set<Pair<String, Integer>> sortDictionary, Integer totalWords)
    {
        Writer out = null;
        try {
            out = new OutputStreamWriter(new FileOutputStream(filename));
            StringBuilder sb = new StringBuilder();
            for(Pair<String, Integer> word: sortDictionary)
            {
                sb.append(word.getKey());
                sb.append(";");
                sb.append(word.getValue());
                sb.append(";");
                sb.append((double)word.getValue() / totalWords * 100);
                sb.append("%");
                sb.append("\n");
                out.write(sb.toString());
                sb.setLength(0);
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
