package unit4;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		int answer = (int) (Math.random()*100+1);
		int input = 0;
		int count=0;
		
		Scanner s = new Scanner(System.in);
		
		do{
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� :");
			input = s.nextInt();
			
			if(answer>input)
				System.out.println("�� ū ���� �Է��ϼ���.");
			else if( answer < input)
				System.out.println("�� ���� ���� �Է��ϼ���.");
			else{
				System.out.println("������ϴ�.");
				break;
			}
				
		}while(true);
				
	}

}
