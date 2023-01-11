import lombok.Builder;
import lombok.ToString;

@ToString
public class Computer {

	// 필수 파라미터
	private String HDD;
	private String RAM;

	// 옵셔널 파라미터
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	// getter만 존재하고 setter는 존재하지 않는다
	
	
	// 생성자는 private
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	// Builder Class
	public static class ComputerBuilder { // nested class -> class 안의 class
		private String HDD;
		private String RAM;

		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

//		public ComputerBuilder(String hdd, String ram) {
//			this.HDD = hdd;
//			this.RAM = ram;
//		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this; // ComputerBuilder 객체 리턴하지 않으면 chaining이 안된다!!!
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}
	public static void main(String[] args) {
		Computer computer = new ComputerBuilder()
								.setBluetoothEnabled(true)
								.setGraphicsCardEnabled(true)
								.build();
		// lombok의 @Builder 구현
	}
}
