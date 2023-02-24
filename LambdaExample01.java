public class LambdaExample01 {
	public static void main(String[] args) {
		String[] arr = {"Java","JS","TS"};
		String[] filter = Arrays.stream(arr).filter((x)-> x.contains("J")).toArray(String[]::new);
		System.out.println(Arrays.toString(filter)); // [Java, JS]
		
		Boolean[] map = Arrays.stream(arr).map((x)-> x.length() == 2).toArray(Boolean[]::new);
		System.out.println(Arrays.toString(map)); // [false, true, true]
		
		var var = Arrays.asList(1,2,3,4,5).stream().reduce(0, (x,y)-> x+y); // 첫번째 인자는 default 값을 설정, x는 연산에 사용되는 변수(sum같은), y는 요소
		System.out.println(var); // 15
		
	}
}
