public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // причина ошибки: деление на 0
        // в классе Calculator внесла изменения в переменную devide
        calc.println.accept(c);
        calc.println.accept(a);
        calc.println.accept(b);

    }
}
