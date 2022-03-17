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
        if(isValidDates())
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

    public boolean isValidDates()
    {
        Period differenceBetweenDates = Period.between(signupDate, currentDate);
        int years = differenceBetweenDates.getYears();
        int months = differenceBetweenDates.getMonths();
        int days = differenceBetweenDates.getDays();
        //System.out.println(years + " " + months + " " + days);

        if(years >= 0 && months >= 0 && days >= 0)
            return true;

        return false;
    }

    public LocalDate calculateAnniversary()
    {
        LocalDate anniversary = LocalDate.of(currentDate.getYear(), signupDate.getMonth(), signupDate.getDayOfMonth());
        return anniversary;
    }
}
