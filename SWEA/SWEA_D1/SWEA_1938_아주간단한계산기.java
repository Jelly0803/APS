package SWEA_API_D1;

import java.util.Scanner;

public class SWEA_1938_아주간단한계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((int)Math.round(a/b));
		
	}
}
