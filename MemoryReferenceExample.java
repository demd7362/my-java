class Data {
	private String name;

	public String getName() {
		return name;
	}
	
	public Data(String name) {
		this.name = name;
	}

	public Data() {
	
	}

	public void setName(String name) {
		this.name = name;
	}

	public Data deepCopy(Data data) {
		return new Data(data.getName());
	}


}

public class MemoryReferenceExample {
	public static void main(String[] args) {
		Data originalData = new Data();
		Data copyData = new Data();

		copyData = originalData;
		System.out.println(originalData.equals(copyData)); // true, 두 객체의 메모리 주소값은 일치
		copyData.setName("나는 카피");
		originalData.setName("나는 오리지널");
		System.out.println("originalData : "+originalData.getName()); // 나는 오리지널
		System.out.println("copyData : "+copyData.getName()); // 나는 오리지널
		
		System.out.println();
		
		copyData = copyData.deepCopy(originalData);
		System.out.println(originalData.equals(copyData)); // false 
		copyData.setName("깊은 복사를 했기때문에 오리지널 데이터는 안바뀔거야");
		System.out.println("copyData : "+copyData.getName()); // 깊은 복사를 했기때문에 오리지널 데이터는 안바뀔거야
		System.out.println("originalData : "+originalData.getName()); // 나는 카피

	}
}
