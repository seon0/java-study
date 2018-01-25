package unit4;

public class Ex11 {

	public static void main(String[] args) {
		ex11();
		System.out.println();
		ex12();
	} // end of main

	public static void ex11() {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + "," + num2);
		for (int i = 0; i < 8; i++) {
			num3 = num2;
			num2 += num1;
			num1 = num3;
			System.out.print("," + num2);
		}
	}

	public static void ex12() {
		int i = 2;
		while (i <= 9) {
			for (int j = 1; j <= 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (i + k == 10)
						break;
					System.out.print(i + k + "*" + j + "=" + ((i + k) * j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
			i = i + 3;
		}
	}
}
