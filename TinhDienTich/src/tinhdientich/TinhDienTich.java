package tinhdientich;
import java.util.*;
public class TinhDienTich {

	public static void main(String[] args) {
		double x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập 2 cạnh của tứ giác vuông");	
		do {
			System.out.print("Cạnh 1:");
			x = sc.nextDouble();
		}while (x<=0);
		do {
			System.out.print("Cạnh 2:");
			y = sc.nextDouble();
		}while (y<=0);	
		double chuVi = (x+y)*2;
		double dienTich = x*y;
		System.out.printf("Chu vi của tứ giác vuông là: %.2f",chuVi);
		System.out.printf("\nDiện tích của tứ giác vuông là: %.2f",dienTich);
		sc.close();
	}

}
