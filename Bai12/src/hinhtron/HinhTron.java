package hinhtron;
import java.util.*;
public class HinhTron {
	public static final double PI = 3.14;

	public static void main(String[] args) {
		double r;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhập bán kính R: ");
			r = sc.nextInt();
		} while(r<=0);
		double chuVi = 2*PI*r;
		double dienTich = PI*r*r;
		System.out.printf("Chu vi hình tròn là: %.2f", chuVi);
		System.out.printf("\nDiện tích hình tròn là: %.2f", dienTich);
		sc.close();			
	}

}
