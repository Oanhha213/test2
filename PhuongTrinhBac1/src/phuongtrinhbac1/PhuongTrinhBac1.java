package phuongtrinhbac1;
import java.util.*;
public class PhuongTrinhBac1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số bậc 1:");
		double a = sc.nextInt();
		System.out.println("Nhập hằng số:");
		double b = sc.nextInt();
		double x = -b/a;
		if( a!= 0) {
			if(b!=0) {			
				System.out.printf("Phương trình có một nghiệm là: %.2f", x);
			}
			else {				
				System.out.println("Phương trình có vô số nghiệm");
			}
		} else {
			System.out.println("Phương trình vô nghiệm");
		}
	}

}
