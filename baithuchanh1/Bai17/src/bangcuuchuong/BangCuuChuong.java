package bangcuuchuong;
import java.util.*;
public class BangCuuChuong {

	public static void main(String[] args) {
		int i,n;
		Scanner sc = new Scanner(System.in);
		for (i=1;i<=9;i++) {
			for (n=1;n<9;n++) {
				System.out.printf("%d x %d = %d  ",n+1,i,i*(n+1));
			}
			System.out.printf("\n");	
		}
		
		System.out.print("Nhập k: ");
		int k = sc.nextInt();
		for (i=1;i<=9;i++) {
			System.out.printf("%d x %d = %d  ",k,i,i*k);
			System.out.printf("\n");	
		}
	}

}
