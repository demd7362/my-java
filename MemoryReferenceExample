class Data {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void deepCopy(Data data) {
		this.name = data.name;

	}


}

public class MemoryReferenceExample {
	public static void main(String[] args) {
		Data originalData = new Data();
		Data copyData = new Data();

		originalData.setName("나는 오리지널");
//		copyData = originalData; // 주석처리하지 않는다면 계속 참조할테니 주석처리해야한다
		copyData.setName("나는 카피");
		System.out.println("originalData : "+originalData.getName()); // 서로 바라보는 참조값이 같기때문에 오리지널 데이터의 값이 카피데이터의 값으로 바뀌었다
		System.out.println("copyData : "+copyData.getName());
		
		System.out.println();
		
		copyData.deepCopy(originalData);
		copyData.setName("깊은 복사를 했기때문에 오리지널 데이터는 안바뀔거야");
		System.out.println("copyData : "+copyData.getName());
		System.out.println("originalData : "+originalData.getName()); // 28번째 코드를 주석처리 하지 않는다면 같은 메모리주소값을 참조한다

	}
}
