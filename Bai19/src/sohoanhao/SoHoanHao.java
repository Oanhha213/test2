package sohoanhao;
import java.util.*;
public class SoHoanHao {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của dãy: ");
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
		      System.out.print("a[" + i + "]: ");
		      a[i] = sc.nextInt();
		}
		int count=0;
		for(int i=0; i < n;i++) {
			int sum =0;
			for(int j=1; j<=a[i]/2;j++) {
				if(a[i] % j ==0) {
					sum+=j;
				}
			}
			if(sum == a[i]) {
				count++;
				System.out.println(a[i]);
			}
		}
		if(count == 0) {
			System.out.println("Không có số hoàn hảo trong dãy");
		}

	}

}
