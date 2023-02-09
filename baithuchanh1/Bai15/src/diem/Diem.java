package diem;
import java.util.*;
public class Diem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Điểm của học sinh là ");
		double hocluc = sc.nextDouble();
		if(hocluc >= 0 && hocluc <= 10) {
			if(hocluc < 5) {
				System.out.println("Học lực Yếu.");
			}else if(hocluc >= 5 && hocluc < 6) {
				System.out.println("Học lực Trung bình.");
			}else if(hocluc >= 6 && hocluc < 7) {
				System.out.println("Học lực Trung bình khá.");
			}else if(hocluc >= 7 && hocluc < 8) {
				System.out.println("Học lực Khá.");
			}else if(hocluc >= 8 && hocluc < 9) {
				System.out.println("Học lực Giỏi.");
			}else if(hocluc >= 9 && hocluc <= 10) {
				System.out.println("Học lực Xuất sắc.");
			}
		}
		else {
			System.out.println("Điểm không hợp lệ!");
		}

	}

}
