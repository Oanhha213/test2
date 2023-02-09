package luythua;
import java.util.*;

public class LuyThua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập x: ");
		int x = sc.nextInt();
		System.out.println("y = 2^"+x);
		
		//tính kết quả
		System.out.println("y = "+ Math.pow(2,x));
	}

}
