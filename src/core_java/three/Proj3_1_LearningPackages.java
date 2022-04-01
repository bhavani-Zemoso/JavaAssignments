package core_java.three;

import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int typeOfPackage;
        int numberOfCourses;
        int totalCost = 0;
        int basePrice, costPerCourse, coursesIncluded;

        System.out.println("Enter the package number? We provide three packages 1, 2, and 3");
        typeOfPackage = keyboard.nextInt();
        System.out.println("Enter the number of courses");
        numberOfCourses = keyboard.nextInt();

        switch(typeOfPackage)
        {
            case 1 :
                basePrice = 10;
                coursesIncluded = 2;
                costPerCourse = 6;
                break;
            case 2 :
                basePrice = 12;
                coursesIncluded = 4;
                costPerCourse = 4;
                break;
            case 3 :
                basePrice = 15;
                coursesIncluded = 6;
                costPerCourse = 3;
                break;
            default:
                System.out.println("Invalid learning package");
                return;

        }

        totalCost = basePrice;
        if(numberOfCourses > coursesIncluded)
            totalCost += ((numberOfCourses-coursesIncluded) * costPerCourse);

        System.out.println("Total cost : " + totalCost);
    }
}
