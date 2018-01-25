package unit4;

public class Ex5 {

	/*
	 * [4-1]
	 * 1. ( x>10 && x<20 )
	 * 2. ( ch!=' ' || ch!='\t' )
	 * 3. ( ch=='x' || ch=='X')
	 * 4. ( ch>'=0' && ch<='9' ) 
	 * 5. ( ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
	 * 6. ( year%400==0 || year%4==0 || year%100!=0 )
	 * 7. ( !powerOn )
	 * 8. ( str=="yes" )
	 * 
	 * [4-2]
	 * int sum=0;
	 * for (int i=1; i<=20;i++) 
	 * 		if( i%2!=0 && i%3!=0)
	 * 			sum+=i;
	 * 
	 * [4-3]
	 * int sum=0;
	 * for(int i=1; i<=10; i++)
	 * 		for( int j=1; j<=10; j++)
	 * 			sum+=j;
	 * 
	 * [4-4]
	 * int sum=0;
	 * for(int i=0; ;i++)
	 * 		sum = i%2==0 ? sum-i : sum+i;
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		
		ex5();
		ex6();
	}
	
	
	static public void ex5(){
		int i=0;
		while(i<10){
			int j=0;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	static public void ex6(){
		
		for(int i=1; i<=6; i++)
			for(int j=1; j<=6; j++)
				if (i+j==6)
					System.out.println("["+i+","+j+"]");
		
	}
	
}
