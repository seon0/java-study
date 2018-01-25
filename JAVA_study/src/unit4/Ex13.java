package unit4;

public class Ex13 {

	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		for (int i = 0; i < value.length(); i++) {
			/* 알맞은 코드를 넣어 완성하시오 (1) . */ 
			ch = value.charAt(i);
			if(! (ch>='0' && ch<='9') )
				isNumber=false;
		}
		if (isNumber) {
			System.out.println(value + " 는 숫자입니다 .");
		} else {
			System.out.println(value + " 는 숫자가 아닙니다 .");
		}
	} // end of main
}
