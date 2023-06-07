package d0428;

public class P83 {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + "JDK";
		
		String str5 = "JDK" + 3 + 3.0;
		String str6 = 3 + 3.0 + "JDK";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);

	}

}
