import java.util.Scanner;

public class _17608_막대기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] stick = new int[N];
		
		for(int i = 0; i < N; i++) {
			stick[i] = sc.nextInt();
		}
		
		int cnt = 1;
		for(int i =0; i < N-1; i++) {
			if(stick[i] > stick[N-1])
				cnt++;
		}
		
		System.out.println(cnt);
	}
}
