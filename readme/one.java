package project;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		for(int i=0;i<=10;i+=2) {
            for(int k=0;k<=10-i;k+=2) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
        
            System.out.println();
        }


	}

}