package unit4;

public class Ex15 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0; // number를 거꾸로 변환해서 담을 변수
		while (tmp != 0) {
			result = result*10 + tmp%10;
			tmp /= 10;
		}
		
		if(number == result)
			System.out.println("회문수 O");
		else
			System.out.println("회문수 x");
	}
}
