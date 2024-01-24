package lesson44;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Rewrite_with_functional_interface {

    public static void main(String[] args) {

        BinaryOperator<String> concat = (a, b) -> a + b;
        System.out.println(concat.apply("1","2"));

        Predicate<String> check = s -> s.length() ==3;
        System.out.println(check.test("pig"));
        System.out.println(check.test("piggy"));

        Predicate<String> checkEven = s -> s.length() % 2 == 0;
        System.out.println(checkEven.test("pi"));
        System.out.println(checkEven.test("pig"));

        UnaryOperator<String> modify = s -> s.toUpperCase();
        System.out.println(modify.apply("wow"));

        UnaryOperator<String> modifyStars = s -> s.length() == 4 ? "****" : s;
        System.out.println(modifyStars.apply("wow"));
        System.out.println(modifyStars.apply("ball"));

    }

}