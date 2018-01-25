package unit4;

public class Ex7 {

	public static void main(String[] args) {
		ex7();
		ex8();
	}

	public static void ex7(){
		int value = (int) (Math.random()*6+1);
		System.out.println("value:" + value);
	}
	
	//2x+4y=10의 해를 구하시오 (0<=x,y<=10)
	public static void ex8(){
		for(int x=0; x<=10; x++)
			for(int y=0; y<=10; y++)
				if( x + 2*y == 5)
					System.out.println("x="+x+", y="+y);
	}
}
