import java.math.BigInteger;
import java.util.Scanner;

public class _10757_큰수AB합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B));
	}
}
