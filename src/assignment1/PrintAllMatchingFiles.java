package assignment1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;
import java.io.File;

public class PrintAllMatchingFiles {

    private static String HOME = System.getProperty("user.home");

    public static void main(String args[])throws IOException
    {
        PrintAllMatchingFiles obj = new PrintAllMatchingFiles();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("Enter a regular expression");
            String regex = br.readLine();

            Pattern pattern = Pattern.compile(regex);
            File filePath  = new File(HOME);
            obj.findMatchingFiles(pattern, filePath);

            System.out.println("Do you want to continue, press n to exit");
            char ch = br.readLine().charAt(0);
            if(ch == 'n' || ch == 'N')
                break;
        }
    }

    public void findMatchingFiles(Pattern regex, File filePath)
    {
        if(filePath.listFiles() != null)
        {
            File filesList[] = filePath.listFiles();

            for(File file : filesList)
            {
                if(file.isDirectory())
                    findMatchingFiles(regex, file);
                else
                {
                    if(Pattern.matches(String.valueOf(regex), file.getName()))
                        System.out.println(file.getAbsolutePath());
                }

            }
        }

    }
}
