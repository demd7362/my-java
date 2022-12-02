package ch17.sec04.exam02;

import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArr = {
            "홍길동",
            "정지훈",
            "박상혁",
            "원인수"
        };
        Arrays.stream(strArr).forEach(s -> System.out.print(s+","));
        System.out.println();

        int[] intArr = {1,2,3,4,5};
        Arrays.stream(intArr).forEach(i -> System.out.print(i+","));
        System.out.println();
    }
}
