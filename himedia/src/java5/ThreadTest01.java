package java5;

public class ThreadTest01 {

	public static void main(String[] args) {
	for(int i = 0; i < 5; i++) {
		System.out.println("thread");
		try {
			Thread.sleep(1000); // thread 를 실행하고 1초씩 쉰다.
		}catch(Exception e) {   //예외처리
			
		}
	}

	}

}
