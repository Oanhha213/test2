package phuongtrinhbac2;
import java.util.*;

public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = sc.nextDouble();
		System.out.print("Nhập b: ");
		double b = sc.nextDouble();
		System.out.print("Nhập c: ");
		double c = sc.nextDouble();
		
		double delta = b*b - 4*a*c;
			
		if(a==0) {
			if(b!=0) {
				if(c==0) {
					System.out.println("Phương trình có vô số nghiệm");
				} else {
					System.out.printf("Phương trình có một nghiệm x = %.2f", -c/b);
				}
			} else {
				if (c==0) {
					System.out.println("Phương trình có vô số nghiệm");					
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			}
		} else {			
			if(delta<0) {
				System.out.println("Phương trình vô nghiệm");
			} 
			else if(delta==0) {
				double x = (-b)/(2*a);
				System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f", x);
			} 
			else {
				double x1 = ((-b)+Math.sqrt(delta))/(2*a);
				double x2 = ((-b)-Math.sqrt(delta))/(2*a);
				System.out.printf("Phương trình có 2 nghiệm phân biệt x1,x2 lần lượt là: %.2f, %.2f", x1, x2);
			}
		}

	}

}
