package assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrencesOfCharacters {

    Map<Character, Integer> alphabetMap = new HashMap<>();
    public static void main(String args[])
    {
        NumberOfOccurrencesOfCharacters instance = new NumberOfOccurrencesOfCharacters();

        String fileName = args[0];
        instance.readFromFile(fileName);
        instance.display();
        instance.writeToFile(fileName);

    }

    public void readFromFile(String fileName)
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                countOccurences(line);
            }
        }
        catch(IOException exception)
        {
            exception.printStackTrace();
        }
    }

    public void countOccurences(String line)
    {
        int length = line.length();
        for(int index = 0; index < length; index++)
        {
            char character = line.charAt(index);
            if(alphabetMap.containsKey(character))
                alphabetMap.put(character, alphabetMap.get(character) + 1);
            else
                alphabetMap.put(character, 1);
        }
    }

    public void display()
    {
        for(Map.Entry<Character, Integer> entry : alphabetMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

    public void writeToFile(String fileName) {

        try
        {
            FileWriter writer = new FileWriter(fileName);
            for(Map.Entry<Character, Integer> entry : alphabetMap.entrySet())
            {
                String line = "Character : " + entry.getKey() + " ; Count : " + entry.getValue();
                writer.write(line);
                writer.write(System.getProperty("line.separator"));
            }

            writer.close();
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }

    }

}
