package assignment12;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        StreamAPI streams = new StreamAPI();
        streams.fillList();

        streams.question1();
        streams.question2();
        streams.question3();
        streams.question4();
        streams.question5();
        streams.question6();
        streams.question7();
        streams.question8();
        streams.question9();
        streams.question10();
    }

    public void fillList()
    {
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));


    }

    public void question1()
    {
        // Print the name of all departments in the college?

        List<String> departments =
                students.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Question 1");
        System.out.println("All departments in the college");
        for(String department : departments)
            System.out.println(department);

        System.out.println();
    }

    public void question2()
    {
        // Get the names of all students who have enrolled after 2018?

        List<String> namesOfStudentsAfter2018 =
                students.stream()
                        .filter(student -> student.getYearOfEnrollment() > 2018)
                        .map(Student::getName)
                        .collect(Collectors.toList());

        System.out.println("Question 2");
        System.out.println("Students enrolled after 2018");
        for(String name : namesOfStudentsAfter2018)
            System.out.println(name);

        System.out.println();

    }

    public void question3()
    {
        // Get the details of all male student in the computer science department?

        List<Student> maleStudentsInCSEDept =
                students.stream()
                        .filter(student -> student.getEngDepartment().equals("Computer Science"))
                        .filter(student -> student.getGender().equals("Male"))
                        .collect(Collectors.toList());

        System.out.println("Question 3");
        System.out.println("Male students in Computer Science department : ");
        for(Student student : maleStudentsInCSEDept)
            System.out.println(student.toString());

        System.out.println();
    }

    public void question4()
    {
        // How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)

        Map<String, Long> maleAndFemaleCount=
        students.stream()
                .collect(Collectors.groupingBy(Student::getGender,
                        Collectors.counting()));

        System.out.println("Question 4");
        System.out.println("Male and Female students count : ");
        for(Map.Entry<String, Long> gender : maleAndFemaleCount.entrySet())
            System.out.println(gender.getKey() + " -> " + gender.getValue());

        System.out.println();
    }

    public void question5()
    {
        // What is the average age of male and female students?

        Map<String, Double> averageAge =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getGender,
                                Collectors.averagingInt(Student::getAge)));

        System.out.println("Question 5");
        System.out.println("Average age of Male and female students");
        for(Map.Entry<String, Double> age : averageAge.entrySet())
            System.out.println(age.getKey() + " -> " + String.format("%.3f", age.getValue()));

        System.out.println();
    }

    public void question6()
    {
        // Get the details of highest student having highest percentage

        Optional<Student> highestPercentageStudent =
                students.stream()
                        .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPercentage)));

        System.out.println("Question no 6");
        System.out.println("Student having the highest percentage : ");
        if(highestPercentageStudent.isPresent())
            System.out.println(highestPercentageStudent.get());

        System.out.println();

    }

    public void question7()
    {
        // Count the number of students in each department? (Hint :use Collectors.groupingBy())

        Map<String, Long> studentsInDepartmentCount =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getEngDepartment,
                                Collectors.counting()));

        System.out.println("Question no 7");
        System.out.println("Number of students in each department : ");
        for(Map.Entry<String, Long> department : studentsInDepartmentCount.entrySet())
            System.out.println(department.getKey() + " -> " + department.getValue());

        System.out.println();
    }

    public void question8()
    {
        // What is the average percentage achieved in each department?

        Map<String, Double> averagePercentageInDept =
                students.stream()
                        .collect(Collectors.groupingBy(Student::getEngDepartment,
                                Collectors.averagingDouble(Student::getPercentage)));

        System.out.println("Question no 8");
        System.out.println("Average percentage in each department");
        for(Map.Entry<String, Double> department : averagePercentageInDept.entrySet())
            System.out.println(department.getKey() + " -> " + department.getValue());

        System.out.println();
    }

    public void question9()
    {
        //  Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)

        Optional<Student> youngestMaleStudent =
                students.stream()
                        .filter(student -> student.getEngDepartment().equals("Electronic"))
                        .filter(student -> student.getGender().equals("Male"))
                        .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)));

        System.out.println("Question no 9");
        System.out.println("Youngest male student in the electronic department : ");
        if(youngestMaleStudent.isPresent())
            System.out.println(youngestMaleStudent.get());

        System.out.println();
    }

    public void question10()
    {
        // How many male and female students are there in the computer science department?

        Map<String, Long> countMaleAndFemaleInCSE =
                students.stream()
                        .filter(student -> student.getEngDepartment().equals("Computer Science"))
                        .collect(Collectors.groupingBy(Student::getGender, Collectors.counting()));

        System.out.println("Question 10");
        System.out.println("Male and Female students in Computer Science Department : ");
        for(Map.Entry<String, Long> gender : countMaleAndFemaleInCSE.entrySet())
            System.out.println(gender.getKey() + " -> " + gender.getValue());
    }
}