package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CheckAllAlphabetOccurences {
    public static void main(String args[]) throws IOException {

        CheckAllAlphabetOccurences obj = new CheckAllAlphabetOccurences();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a sentence");
        String inputString = br.readLine().toLowerCase();

        System.out.println(obj.checkOccurrences(inputString));
    }

    public boolean checkOccurrences(String inputString)
    {
        Set<Character> alphabetSet = new HashSet<>();

        int strLength = inputString.length();

        for(int i = 0; i < strLength; i++)
        {
            char ch = inputString.charAt(i);
            if(Character.isLetter(ch))
                alphabetSet.add(inputString.charAt(i));
        }

        if(alphabetSet.size() == 26)
            return true;

        return false;
    }
}
