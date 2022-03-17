package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PingTest {
    public static void main(String args[]) throws IOException
    {
        PingTest instance = new PingTest();
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Enter an IP address");
        String IPAddress = scanInput.nextLine();

        instance.pingHost(IPAddress);
    }

    public void pingHost(String IPAddress) throws IOException
    {
        final int TIME_FIELD = 4;
        String command = "ping " + IPAddress;
        Process OSProcess = Runtime.getRuntime().exec(command);

        BufferedReader reader = new BufferedReader(new InputStreamReader(OSProcess.getInputStream()));

        String line = "";
        int timeArray[] = new int[4];

        reader.readLine();
        reader.readLine();

        for(int i = 1; i <= 4; i++)
        {
            line = reader.readLine();
            //System.out.println(line);

            //Splitting the line and extracting the time field
            String splitLine[] = line.split(" ");
            String timeString = splitLine[TIME_FIELD];
            int length = timeString.length();

            int time = Integer.parseInt(timeString.substring(5, length-2));
            timeArray[i-1] = time;
            //System.out.println(time);
        }
        
        Arrays.sort(timeArray);
        double median = (timeArray[1] + timeArray[2])/2.0;
        //System.out.println(timeArray[1] + " " + timeArray[2]);
        System.out.println("Median = " + median);

    }
}
