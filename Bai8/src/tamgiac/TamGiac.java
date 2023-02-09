package tamgiac;
import java.util.*;
public class TamGiac {

	public static void main(String[] args) {
		double chuVi, nuaChuVi, dienTich, canh1, canh2,canh3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập độ dài 3 cạnh");		
		do {
			System.out.print("Nhập cạnh 1: ");
			 canh1 = sc.nextDouble();			
		} while(canh1<=0);
		do {
			System.out.print("Nhập cạnh 2: ");
			 canh2 = sc.nextDouble();			
		} while(canh2<=0);
		do {
			System.out.print("Nhập cạnh 3: ");
			 canh3 = sc.nextDouble();				
		} while(canh3<=0);		 
		if((canh1+canh2>canh3)&&(canh1+canh3>canh2)&&(canh2+canh3>canh1)) {
			System.out.println("3 cạnh trên tạo thành một tam giác");
			chuVi = canh1+canh2+canh3;
			System.out.println("Chu vi tam giác là: " +chuVi);
			nuaChuVi = chuVi/2;
			dienTich= Math.sqrt(nuaChuVi*(nuaChuVi-canh1)*(nuaChuVi-canh2)*(nuaChuVi-canh3));
			System.out.printf("Diện tích tam giác là: %.2f",dienTich);
		} else {
			System.out.println("3 cạnh trên không tạo thành một tam giác");
		}
		sc.close();
	}

}
