package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        
        // 컬렉션의 요소를 동적으로 추가하는 경우가 많은데, 요소가 없을때 예외가 발생한다
        // double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

        //방법1
        OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
        if(optional.isPresent()){ // isPresent() 메소드를 이용해서 예외처리
            System.out.println("방법1_평균: "+optional.getAsDouble());
        } else System.out.println("방법1_평균: 0.0");

        //방법2
        
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0); // orElse() 메소드를 이용한 예외처리
        System.out.println("방법2_평균: "+avg);

        list.stream().mapToInt(Integer::intValue).average().ifPresent(a->System.out.println("방법3_평균: "+a)); // ifPresent() 존재할 경우에만 출력


    }
}
