import java.util.*;

class GetOrDefaultExample {
    public static void main(String[] args) {
        int[] arr = new int[100]; // 크기 100 배열 생성
        Random rd = new Random();
        for(int i=0; i<arr.length; i++){
            arr[i] = rd.nextInt(10)+1; // 1부터 10까지 범위의 랜덤한 숫자를 배열에 넣는다 
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1); // key값이 존재한다면 기존 key의 value값 사용, 존재하지 않는다면 0, 그리고 +1
        }
        System.out.println(map); // 1부터 10까지의 숫자 갯수 카운트
    }
}
