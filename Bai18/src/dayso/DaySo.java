package dayso;
import java.util.*;
public class DaySo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của dãy n : ");
		int n = sc.nextInt();
		System.out.print("Nhập x cần tìm : ");
		int x = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
		      System.out.print("a["+ i +"] = ");
		      a[i] = sc.nextInt();
		}
		int dem=0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j<n;j++) {
				if(a[i]+a[j] == x) {
			    	System.out.printf("%d + %d = %d\n", a[i],a[j],x);
					dem++;
				}
			}
		}
		if(dem == 0) {
			System.out.print("Không có giá trị nào thỏa mãn!");
		}

	}

}
