import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply;
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;
    UnaryOperator<Integer> pow;
    UnaryOperator<Integer> abs;
    Predicate<Integer> isPositive;

    {
        pow = x -> x * x;
        isPositive = x -> x > 0;
    }

    Consumer<Integer> println = System.out::println;

    public Calculator() {

        abs = x -> x > 0 ? x : x * -1;

        multiply = (x, y) -> x * y;
    }
}
