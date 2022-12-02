package ch16.practice;

interface Operator {
    int apply(int x,int y);
}

public class Q07 {
    private static int[] scores = {10,50,3,40,30,20,80,100,1,2};

    public static int maxOrMin(Operator operator){
        int result = scores[0];
        for(int score : scores){
            result = operator.apply(result, score);
        }
        return result;
    }
    public static void main(String[] args) {
        int max = maxOrMin( (x,y) -> {
            if(x > y){
                return x;
            } else return y;
        });
        System.out.println("최대값 : "+max);
        int min = maxOrMin( (x,y) -> {
            return x<y? x:y;
        });
        System.out.println("최소값 : "+min);
    }
}
