import java.util.function.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println("Hi, " + s);
        consumer.accept("Мир");

        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + " повторяется " + i + " раз.");
         biConsumer.accept("Hi", 3);

        Supplier<String> supplier = () -> "Java";
        System.out.println("Supplier: " + supplier.get());

         Predicate<String> predicate = s -> s.length() > 5;
        System.out.println("Predicate (Hi): " + predicate.test("Hi"));

        BiPredicate<String, Integer> biPredicate = (s, i) -> s.length() == i;
        System.out.println("BiPredicate (Java, 16): " + biPredicate.test("Java", 4));

        Function<String, Integer> function = s -> s.length();
        System.out.println("Function (Hi): " + function.apply("Hi"));

        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println("BiFunction (Kanday, Jakshy): " + biFunction.apply("Hello", "World"));
    }
}

//        Consumer<String> consumer;
//        BiConsumer<String, Integer> biConsumer;
//        Supplier<String> supplier;
//        Predicate<String> predicate;
//        BiPredicate<String, Integer> biPredicate;
//        Function<String, Integer> function;
//        BiFunction<String, String, Integer> biFunction;