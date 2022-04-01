package assignment7.five;

public class ExecuteInnerClasses {
    public static void main(String args[])
    {
        Curriculum.Subject subject = new Curriculum().new Subject("123", "Data Structures and Algorithms", "8987", "CSE");
        System.out.println(subject.getSubjectId());
        System.out.println(subject.getSubjectName());
        System.out.println(subject.getDepartmentId());
        System.out.println(subject.getDepartmentName());
    }

}
