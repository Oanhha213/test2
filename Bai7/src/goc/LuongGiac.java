package goc;
import java.util.*;
public class LuongGiac {
	public static final float PI = 3.14f;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập 1 góc: ");
		double x = sc.nextInt();		
		while (x > 180 || x < -180)
        {
            System.out.println("Nhap lai goc (-180<<= x <=180) x:");
            x = sc.nextDouble();
        }
		double a=(double)x*PI/180;
		System.out.println("Sin("+x+") = " + Math.sin(a));
		System.out.println("Cos("+x+") = " + Math.cos(a));
		System.out.println("Tan("+x+") = " + Math.tan(a));
		System.out.println("Cot("+x+") = " + 1/Math.tan(a));
		sc.close();
	}

}
