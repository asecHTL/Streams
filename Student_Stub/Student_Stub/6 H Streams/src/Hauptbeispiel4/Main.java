package Hauptbeispiel4;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        final int result = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(num -> num % 2 != 0)
                .map(num -> num * num)
                .reduce(0, Integer::sum);

        System.out.println("Summe der Quadrate der ungeraden Zahlen von 1 bis 10: " + result);
    }
}
