package assignment6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class VampireNumbers {

    public static void main(String args[])
    {
        VampireNumbers instance = new VampireNumbers();
        TreeSet<Long> vampireNumbers = instance.findVampireNumbers();
        instance.displayVampireNumbers(vampireNumbers);
    }

    public TreeSet<Long> findVampireNumbers()
    {
        TreeSet<Long> vampireNumbers = new TreeSet<>();

        for(long number = 1000; vampireNumbers.size() <= 100; number++)
        {
            //System.out.println(number);
            if(findNumberOfDigits(number) % 2 != 0)
            {
                number *= 10;
                continue;
            }

            if(isVampireNumber(number))
                vampireNumbers.add(number);
        }

        return vampireNumbers;

    }

    public boolean isVampireNumber(long number)
    {
            for(long factor1 = 2; factor1 <= Math.sqrt(number); factor1++)
            {
                if(number % factor1 == 0)
                {
                    long factor2 = number/factor1;
                    if(checkValidity(number, factor1, factor2))
                        return true;
                }
            }

        return false;
    }

    public int findNumberOfDigits(long number)
    {
        return (int)Math.floor(Math.log10(number)  + 1);
    }

    public boolean checkValidity(long number, long factor1, long factor2)
    {
        if(Long.toString(factor1).endsWith("0") && Long.toString(factor2).endsWith("0"))
            return false;

        int originalNumberDigitCount = findNumberOfDigits(number);
        if(findNumberOfDigits(factor1) != originalNumberDigitCount/2 ||
               findNumberOfDigits(factor2) != originalNumberDigitCount/2)
            return false;

        byte[] numberBytes = Long.toString(number).getBytes();
        byte[] factorBytes = (Long.toString(factor1) + Long.toString(factor2)).getBytes();

        Arrays.sort(numberBytes);
        Arrays.sort(factorBytes);

        return Arrays.equals(numberBytes, factorBytes);
    }

    public void displayVampireNumbers(TreeSet<Long> vampireNumbers)
    {
        for(Long number : vampireNumbers)
            System.out.println(number);
    }
}
