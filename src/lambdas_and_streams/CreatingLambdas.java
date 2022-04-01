package lambdas_and_streams;

/*
    Business Requirement : Creating a formal greeting for visitors.

    Given a visitor the program should return an output formally greeting the visitor.

    Example : Input/Output
    "Harry"/"Hello, Harry"
    "Miss Pingu"/"Hello, Miss Pingu"

    Exception/Unhappy flow:
    "Did you forget something?"

 */

public class CreatingLambdas {

    interface Greeting
    {
        public String sayHello(String g);
    }

    public void testGreeting(String a, Greeting g)
    {
        String result = g.sayHello(a);

        System.out.println("Result : " + result);
    }

    public static void main(String[] args) {
        //input -> body

        new CreatingLambdas().testGreeting("Harry", (String s) -> "Hello " + s);

        new CreatingLambdas().testGreeting("Miss Pingu", (String s) -> "Hello " + s);

        //(String p) -> !p.isEmpty()? "Howdy, " + p : "Did you forget something?"

        new CreatingLambdas().testGreeting("", (String p) -> !p.isEmpty() ? "Howdy, " + p : "Did you forget something?");

    }

}
