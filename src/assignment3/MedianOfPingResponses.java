package assignment3;

import test.PingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MedianOfPingResponses {

    BufferedReader reader;
    final int TIME_FIELD = 4;
    Process OSProcess;

    public static void main(String args[]) throws IOException
    {
        MedianOfPingResponses instance = new MedianOfPingResponses();
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Enter an IP address");
        String IPAddress = scanInput.nextLine();

        instance.pingHost(IPAddress);
        instance.calculateMedian();
    }

    public void pingHost(String IPAddress) throws IOException
    {
        String command = "ping " + IPAddress;
        OSProcess = Runtime.getRuntime().exec(command);
    }

    public void calculateMedian() throws IOException
    {
        reader = new BufferedReader(new InputStreamReader(OSProcess.getInputStream()));

        String line = "";
        int timeArray[] = new int[4];

        skipFirstTwoLines();

        for(int i = 1; i <= 4; i++)
        {
            line = reader.readLine();

            int time = extractTimeFieldFromLine(line);

            timeArray[i-1] = time;
        }

        Arrays.sort(timeArray);
        double median = (timeArray[1] + timeArray[2])/2.0;
        System.out.println("Median = " + median);
    }

    public void skipFirstTwoLines() throws IOException
    {
        reader.readLine();
        reader.readLine();
    }

    public int extractTimeFieldFromLine(String line)
    {
        //Splitting the line and extracting the time field
        String splitLine[] = line.split(" ");
        String timeString = splitLine[TIME_FIELD];
        int length = timeString.length();

        return (Integer.parseInt(timeString.substring(5, length-2)));
    }
}
