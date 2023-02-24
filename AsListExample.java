public class AsListExample {
	public static void main(String[] args) {
		String[] arr = {"Java","JS","TS"};
		List<String> list = Arrays.asList(arr); // arr 메모리 주소값을 참조하는 사이즈 불변의 고정된 list
		list.set(0, "Kotlin");
		System.out.println(Arrays.toString(arr)); // [Java, JS, Kotlin] arr 주소값을 참조하고 있기 때문에 list의 요소를 바꾸면 arr의 값도 바뀐다.
		arr[2] = "Go";
		System.out.println(list); // [Kotlin, JS, Go]
		//list.add("Scala"); // 불변의 리스트기 때문에 UnsupportedOperationException 발생
		
		List<String> newList = new ArrayList<>(list); 
		newList.add("Scala");
		System.out.println(newList); // 객체를 새로 생성했고 요소만 가져온 것 
		 
		List<String> newList2 = new ArrayList<>(Arrays.asList(arr)); 
		arr[2] = "C#";
		System.out.println(newList2); // [Kotlin, JS, Go]
		
	}
}
