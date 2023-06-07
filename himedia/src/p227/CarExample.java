package p227;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		Car myCar = new Car();
		
		//필드값 일기
		System.out.println("제작회사: " +  myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.maxspeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도:" + myCar.speed);
		
		Car genesis = new Car();
		genesis.model = "g80";
		genesis.color = "빨강";
		genesis.maxspeed = 400;
		genesis.speed = 120;
		
		System.out.println("제작회사: " +  genesis.company);
		System.out.println("모델명 : " + genesis.model);
		System.out.println("색깔 : " + genesis.maxspeed);
		System.out.println("현재속도 : " + genesis.speed);
		

	}

}
