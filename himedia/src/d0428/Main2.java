package d0428;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 84;
		
		if(score >=90) {
			System.out.println("A");
			if(score >=95) {
				System.out.println("+");
			} else {
				System.out.println("-");
			}
		}else {
			System.out.print("B");
			if (score >=85) {
				System.out.println("+");
			}else {
				System.out.println("-");
			}
		}

	}

}
