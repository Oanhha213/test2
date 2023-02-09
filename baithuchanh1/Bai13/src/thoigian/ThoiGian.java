package thoigian;
import java.util.*;
public class ThoiGian {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);		
		do {
			System.out.print("Nhập số giây: ");
			t = sc.nextInt();
		}while (t < 0);
		int gio =  t/3600;
		int phut = (t % 3600)/60;
		int giay = (t % 3600) % 60;			
		System.out.printf("%02d:%02d:%02d", gio, phut, giay);
		sc.close();
	}

}
