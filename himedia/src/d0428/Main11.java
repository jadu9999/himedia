package d0428;

public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 16; i++) {
			//System.out.print(i + "?");
			System.out.print(i);
			if(i < 15) {
			System.out.print("?");
			}
		}
		System.out.println();
		//while
		int j = 1;
		while(j < 16) {
			System.out.print(j++ + " ");
		}
		System.out.println();
		
		//do while
		int k =1; 
		do {
			System.out.print(k++ + " ");
		}while(k < 16);
	}

	
   }

