package src;

import java.io.*;
import java.util.*;

public class ReadFile
{
    public static List<String> readFile(String filename)
    {
        List<String> listOfWords = new ArrayList<>();
        Reader in = null;
        try 
        {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
            StringBuilder sb = new StringBuilder();
            int symbol = in.read();
            while (symbol != -1)
            {
                if (Character.isLetterOrDigit(Character.toLowerCase((char)symbol)))
                {
                    sb.append(Character.toLowerCase((char)symbol));
                }
                else
                {
                    if (sb.length() > 0)
                    {
                        listOfWords.add(sb.toString());
                    }
                    sb.setLength(0);
                }
                symbol = in.read();
            }
            if (sb.length() > 0)
            {
                listOfWords.add(sb.toString());
            }
        }
        catch (IOException e) 
        {
            System.err.println("Error while reading file: " + e.getLocalizedMessage());
        }
        finally
        {
            if (in != null) 
            {
                try
                {
                    in.close();
                }
                catch (IOException e) 
                {
                    e.printStackTrace(System.err);
                }
            }
        }
        return listOfWords;
    }
    
}