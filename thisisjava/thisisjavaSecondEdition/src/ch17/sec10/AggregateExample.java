package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        // 카운팅, 리턴타입 long
        long count = Arrays.stream(arr).filter(a->a%2==0).count();
        System.out.println("2의 배수 개수: "+count);

        // 리턴타입 int,long,double
        long sum = Arrays.stream(arr).filter(a->a%2==0).sum();
        System.out.println("2의 배수의 합: "+sum);

        // 평균구하기, 리턴타입은 당연히 double
        double avg = Arrays.stream(arr).filter(a->a%2==0).average().getAsDouble();
        System.out.println("2의 배수의 평균: "+avg);

        int max = Arrays.stream(arr).filter(a->a%2==0).max().getAsInt();
        System.out.println("2의 배수의 최대값: "+max);

        int min = Arrays.stream(arr).filter(a->a%2==0).min().getAsInt();
        System.out.println("2의 배수의 최솟값: "+min);

        // 첫번째 요소
        int first = Arrays.stream(arr).filter(a->a%3==0).findFirst().getAsInt();
        System.out.println("첫번째 3의 배수: "+first);

        
    }
}
