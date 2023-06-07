package p431;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.method1();
		anony.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("SmartTv를 켭니다.");
					}
						@Override
						public void turnOff() {
							System.out.println("SmartTv를 끕니다.");
						}
					
				});

	}

}
