package D3;

import java.util.Scanner;

public class _12368_24시간 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc = 1; tc<=T; tc++) {
            int h1 = sc.nextInt();
            int h2 = sc.nextInt();
            int h3 = (h1+h2)%24;
             
            System.out.println("#" + tc + " " + h3);
        }
    }
}