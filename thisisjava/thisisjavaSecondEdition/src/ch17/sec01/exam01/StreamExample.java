package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("정지훈");
        set.add("원인수");
        set.add("박상혁");
        
        Stream<String> stream = set.stream();
        stream.forEach( name -> System.out.println(name));
    }
}
