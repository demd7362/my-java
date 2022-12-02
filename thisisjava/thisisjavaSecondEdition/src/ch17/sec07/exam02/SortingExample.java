package ch17.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> stdList = new ArrayList<>();
        stdList.add(new Student("정지훈",80));
        stdList.add(new Student("원인수",50));
        stdList.add(new Student("박상혁",90));

        // sorted( (o1, o2) -> Integer.compare(o1.getScore(), o2.getScore()) ) 
        // 익명객체처럼 람다식으로 구현, 자동완성 기능 애용하자
        stdList.stream().sorted((o1, o2) -> Integer.compare(o1.getScore(), o2.getScore())).forEach(s -> System.out.println(s.getName()+ " : "+s.getScore()));

        stdList.stream().sorted((o1, o2) -> Integer.compare(o2.getScore(), o1.getScore())).forEach(s -> System.out.println(s.getName()+ " : "+s.getScore())); // 순서를 바꿔서 내림차순 정렬
    }
}
