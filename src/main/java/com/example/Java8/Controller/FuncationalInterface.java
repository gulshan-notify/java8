package com.example.Java8.Controller;
@FunctionalInterface
public interface FuncationalInterface {


    void run();

    default void log() {
        System.out.println("Logging");
    }

    static void info() {
        System.out.println("Info");
    }

    /*Predicate
    Predicate<Integer> isEven = n -> n % 2 == 0;
System.out.println(isEven.test(10)); // true

    Function
    Function<String, Integer> length = s -> s.length();

    Consumer
    Consumer<String> print = s -> System.out.println(s);
print.accept("Hello");

    Supplier
    Supplier<Double> random = () -> Math.random();
*/

}
