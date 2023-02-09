package thaotacso;
import java.util.*;

public class ThaoTacSo {

	public static void main(String[] args) {
		int num1, num2, sum;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào số thứ nhất: ");
		num1 = scanner.nextInt();
		
		System.out.print("Nhập vào số thứ hai: ");
		num2 = scanner.nextInt();
		
		sum = num1 + num2;
		System.out.printf("Tổng của %d và  %d là : %d", num1, num2, sum);

	}

}