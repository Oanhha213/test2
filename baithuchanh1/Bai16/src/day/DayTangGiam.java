package day;
import java.util.*;
public class DayTangGiam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của dãy n = ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("a["+ i +"] = ");
			a[i] = sc.nextInt();
		}		
		int tang = 0;
	    for (int i = 0; i < n - 1; i++){
	        if (a[i + 1] >= a[i])
	        	tang++;
	    }
	    
	    int giam=0;
	    for (int i = 0; i < n - 1; i++){
	        if (a[i] > a[i + 1])
	        	giam++;
	    }
	    if (tang == n-1) {
	    	System.out.print("Day tang");	    	
	    } else if(giam == n-1) {	    	
	    	System.out.print("Day giam");
	    } else {	    	
	    	System.out.print("Day ko tang ko giam ");
	    }
	}
}