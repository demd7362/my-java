package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;
    public static void main(String[] args) {
        IntStream.range(1, 101).forEach(a-> sum+=a);
        System.out.println(sum);
    }
}
