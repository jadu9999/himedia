package p389;

public class Car {
	Tire frontLeftTire = new HanKoookTire();
	Tire frontRightTire = new HanKoookTire();
	Tire backLeftTire = new HanKoookTire();
	Tire backRightTire = new HanKoookTire();
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	

}
