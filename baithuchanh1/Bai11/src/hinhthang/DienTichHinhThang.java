package hinhthang;
import java.util.*;
public class DienTichHinhThang {

	public static void main(String[] args) {
		double a,b,h;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhập đáy a: ");
			 a = sc.nextInt();
		} while (a<=0);
		do {
			System.out.print("Nhập đáy b: ");
			 b = sc.nextInt();
		} while (b<=0);
		do {
			System.out.print("Nhập chiều cao h: ");
			h = sc.nextInt();
		} while (h<=0);
		double dienTich = (a+b)*h/2;
		System.out.println("Diện tích hình thang là: " + dienTich);
		sc.close();
	}

}
