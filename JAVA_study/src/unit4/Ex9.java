package unit4;

public class Ex9 {

	public static void main(String[] args) {
		ex9();
	}

	public static void ex9(){
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum+= str.charAt(i)-'0';
		}
		System.out.println("sum=" + sum);
	}
}
