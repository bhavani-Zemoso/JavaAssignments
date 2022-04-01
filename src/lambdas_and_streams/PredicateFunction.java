package lambdas_and_streams;

import java.util.function.Predicate;

public class PredicateFunction {

    Predicate<Employee2> bonusLambda = (emp) -> emp.getRatings() > 10 ? true : false;
    Predicate<Employee2> execLambda = (emp) -> emp.getId().startsWith("E99") ? true : false;

    Predicate<String> emptyString = (s) -> s.isEmpty();

    public static void main(String[] args) {

    }
}
