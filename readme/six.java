package project;

import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
        System.out.print("화씨(F):");
        double F=in.nextInt();
        System.out.printf("섭씨(C):%.1f",((5*(F-32))/9));

	}

}