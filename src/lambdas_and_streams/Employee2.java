package lambdas_and_streams;

public class Employee2 {

    private String id = null;
    private int ratings = 10;
    public Employee2(String empId) {
        this.setId(empId);
    }

    public int getRatings() {
        return ratings;
    }
    public void setRatings(int rating) {
        this.ratings = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}

