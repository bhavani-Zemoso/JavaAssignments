package assignment7.five;

public class Curriculum {
    class Subject extends University.Department
    {
        String subjectId, subjectName;

        public Subject(String subjectId, String subjectName, String departmentId, String departmentName) {
            new University("ABC University").super(departmentId, departmentName);
            this.subjectId = subjectId;
            this.subjectName = subjectName;
        }

        public String getSubjectId() {
            return subjectId;
        }

        public String getSubjectName() {
            return subjectName;
        }
    }
}
