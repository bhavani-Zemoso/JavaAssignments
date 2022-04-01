package assignment9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String args[]) throws IOException {
        TestRegularExpression instance = new TestRegularExpression();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String sentence = reader.readLine();

        boolean test = instance.testSentence(sentence);
        if(test)
            System.out.println("Sentence matched");
        else
            System.out.println("Sentence does not match");
    }

    public boolean testSentence(String sentence)
    {
        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
        Matcher match = pattern.matcher(sentence);
        return match.matches();
    }

}
