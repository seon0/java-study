package unit4;

public class Ex15 {

	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0; // number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		while (tmp != 0) {
			result = result*10 + tmp%10;
			tmp /= 10;
		}
		
		if(number == result)
			System.out.println("ȸ���� O");
		else
			System.out.println("ȸ���� x");
	}
}
