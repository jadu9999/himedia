package sec03.exam002;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		
		System.out.println(charValue);
		
		long longvalue = 500;
		intValue = (int) longvalue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);

	}

}
