package assignment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class RangeOfDatesForKycForm {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate signupDate, currentDate;

    public static void main(String args[]) throws IOException{
        RangeOfDatesForKycForm instance = new RangeOfDatesForKycForm();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of testcases");
        int testCases = Integer.parseInt(reader.readLine());

        while(testCases-- > 0)
        {
            System.out.println("Enter the signup date and the current date separated by a space");
            String dates[] = reader.readLine().split(" ");

            instance.formatAndStoreDates(dates);
            instance.findRange();
        }
    }

    public void formatAndStoreDates(String dates[])
    {
        signupDate = LocalDate.parse(dates[0], formatter);
        currentDate = LocalDate.parse(dates[1], formatter);
    }

    public void findRange()
    {
        if(currentDate.isAfter(signupDate))
        {
            LocalDate anniversary = calculateAnniversary();
            System.out.println("Anniversary = " + anniversary);

            LocalDate startDate = anniversary.minusDays(30);
            LocalDate endDate = anniversary.plusDays(30);

            if(currentDate.isBefore(endDate))
                System.out.println(startDate.format(formatter) + " " + currentDate.format(formatter));
            else
                System.out.println(startDate.format(formatter) + " " + endDate.format(formatter));
        }

        else
            System.out.println("No range");
    }

    public LocalDate calculateAnniversary()
    {
        LocalDate anniversary;

        if(signupDate.getMonthValue() == 2 && signupDate.getDayOfMonth() == 29 && !currentDate.isLeapYear())
            anniversary = LocalDate.of(currentDate.getYear(), signupDate.getMonth(), 28);
        else
            anniversary = LocalDate.of(currentDate.getYear(), signupDate.getMonth(), signupDate.getDayOfMonth());

        return anniversary;
    }
}
