package tong;
import java.util.*;
public class Tong {

	public static void main(String[] args) {
		int i, giaiThua=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập x: ");
		int x = sc.nextInt();
		System.out.print("Nhập n: ");
		n = sc.nextInt();
		double sum = 0;
		while(n<=0) {
			System.out.print("Nhập n: ");
			n = sc.nextInt();
		}
		if (x==0 ) {
			System.out.println("S(0,"+n+") = 0");
		} else {
			for(i=1; i<=n; i++) {
				giaiThua = giaiThua*i; 
				sum = sum + Math.pow(x,i)/giaiThua; 
			}			
			System.out.printf("S(%d,%d) = %.3f", x, n, sum);
		}
	}
}

