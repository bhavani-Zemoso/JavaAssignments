package lambdas_and_streams;

public class TargetType {

    interface Email
    {
        public String construct(String name);
    }

    Email email = (String name) -> name + "@gmail.com";

    public String getEmail(String name, Email email)
    {
        return null;
    }
    public static void main(String[] args) {
        new TargetType().getEmail("Bhavani", (String name) -> name + "@gmail.com");
    }
}
