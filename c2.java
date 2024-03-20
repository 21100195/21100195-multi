package today;

import java.util.Scanner;

public class c2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 :");
		int number = in.nextInt();
		
		if (number % 2 == 0)
			System.out.println("짝수!");
		else
			System.out.println("홀수!");
		System.out.println("종료");
	}
}
