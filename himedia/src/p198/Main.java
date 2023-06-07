package p198;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]scores = {95,71,84,93,87};
		//향상된 포문
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);

		
		//일반for문
		int sum2 = 0;
		for(int i = 0; i<scores.length; i++) {
			sum2 += scores[i];
			
		}
		System.out.println("점수 총합 = " + sum2);
		
	    double avg2 = (double) sum2 / scores.length;
		System.out.println("점수 평균 : " + avg2);
		
		//홀수
		int sum3 = 0;
		for(int i = 0; i<scores.length; i+=2) {
			System.out.println(scores[i] + " ");
			}
		for (int i = 2; i< scores.length; i++) {
			System.out.println(scores[i] + " ");
		}
	}

}
