package ch17.sec12.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * CollectExample
 */
public class CollectExample {

    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("정지훈","남",90));
        totalList.add(new Student("병지순","여",50));
        totalList.add(new Student("을지훈","남",40));
        totalList.add(new Student("갑지순","여",70));

        // 학생 이름을 키, Student 객체를 값으로 갖는 Map 생성
        Map <String,List<Student>> map = totalList.stream().collect(Collectors.groupingBy(s->s.getSex()));

        List<Student> maleList = map.get("남");
        maleList.stream().forEach(s->System.out.println(s.getName()));
        System.out.println();

        List<Student> femaleList = map.get("여");
        femaleList.stream().forEach(s->System.out.println(s.getName()));
        
     }
}