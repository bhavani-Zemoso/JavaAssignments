package assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MedianOfPingResponses {

    BufferedReader reader;
    Process OSProcess;

    public static void main(String args[]) throws IOException
    {
        MedianOfPingResponses instance = new MedianOfPingResponses();
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Enter an IP address");
        String IPAddress = scanInput.nextLine();

        System.out.println("Enter the number of responses required");
        int responseCount = Integer.parseInt(scanInput.nextLine());

        instance.pingHost(IPAddress, responseCount);
        instance.calculateMedian(responseCount);
    }

    public void pingHost(String IPAddress, int responseCount) throws IOException
    {
        String command = "ping " + IPAddress + " -n " + responseCount;
        OSProcess = Runtime.getRuntime().exec(command);
    }

    public void calculateMedian(int responseCount) throws IOException
    {
        reader = new BufferedReader(new InputStreamReader(OSProcess.getInputStream()));

        String line = "";
        ArrayList<Integer> timeArray = new ArrayList<>();

        skipFirstTwoLines();

        for(int i = 1; i <= responseCount; i++)
        {
            line = reader.readLine();

            //System.out.println(line);
            int time = extractTimeFieldFromLine(line);

            timeArray.add(time);
        }

        Collections.sort(timeArray);

        double sum = 0;
        for(int i = 0; i < timeArray.size(); i++)
            sum += timeArray.get(i);

        double median = sum / responseCount;

        System.out.println("Median = " + median);
    }

    public void skipFirstTwoLines() throws IOException
    {
        reader.readLine();
        reader.readLine();
    }

    public int extractTimeFieldFromLine(String line)
    {
        Pattern pattern = Pattern.compile("time=(\\d+)ms");
        Matcher match = pattern.matcher(line);

        match.find();
        String time = match.group(1);
        return (Integer.parseInt(time));
    }
}
