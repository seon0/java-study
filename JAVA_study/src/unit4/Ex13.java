package unit4;

public class Ex13 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		for (int i = 0; i < value.length(); i++) {
			/* �˸��� �ڵ带 �־� �ϼ��Ͻÿ� (1) . */ 
			ch = value.charAt(i);
			if(! (ch>='0' && ch<='9') )
				isNumber=false;
		}
		if (isNumber) {
			System.out.println(value + " �� �����Դϴ� .");
		} else {
			System.out.println(value + " �� ���ڰ� �ƴմϴ� .");
		}
	} // end of main
}
