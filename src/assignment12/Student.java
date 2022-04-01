package assignment12;

public class Student {
    private int id;
    private String name;
    private int age;
    private String gender, engDepartment;
    private int yearOfEnrollment;
    private double percentage;

    public Student(int id, String name, int age, String gender, String engDepartment,
                   int yearOfEnrollment, double percentage)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.percentage = percentage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString()
    {
        return "ID : " + id + "; Name : " + name + "; age : " + age
                + "; Gender : " + gender + "; Department : " + engDepartment
                + "; Year of Enrollment : " + yearOfEnrollment + "; Percentage : " + percentage;
    }
}
