package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("정지훈","남",90));
        totalList.add(new Student("병지순","여",50));
        totalList.add(new Student("을지훈","남",40));
        totalList.add(new Student("갑지순","여",70));

        //남학생만 묶어 list 생성
        // totalList.stream().filter(s->s.getSex().equals("남")).collect(Collectors.toList()); 같은 표현
        List<Student> maleList = totalList.stream().filter(s->s.getSex().equals("남")).toList(); 

        maleList.stream().forEach(s-> System.out.println(s.getName()));

        // 학생 이름을 키, 점수를 값으로 갖는 Map 생성
        Map<String,Integer> map = totalList.stream().collect(Collectors.toMap(s-> s.getName(),s-> s.getScore()));

        System.out.println(map);
    }
}
