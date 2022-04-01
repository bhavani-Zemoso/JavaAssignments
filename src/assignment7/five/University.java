package assignment7.five;

public class University {
    String universityName;

    public University(String universityName)
    {
        this.universityName = universityName;
    }

    class Department
    {
        String departmentId;
        String departmentName;

        /*public Department()
        {
            this.departmentId = this.departmentName = "";
        }*/

        public Department(String departmentId, String departmentName)
        {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }

        public String getDepartmentId() {
            return departmentId;
        }

        public String getDepartmentName() {
            return departmentName;
        }
    }
}
