package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Nhập a =");
		a = sc.nextInt();
		System.out.println("Nhập b =");
		b = sc.nextInt();

		int tong = a + b;
		int hieu = a - b;
		int tich = a * b;
		int thuong = a / b;

		System.out.println("Tổng :" + tong);
		System.out.println("Hiệu :" + hieu);
		System.out.println("Tích :" + tich);
		System.out.println("Thương :" + thuong);

		System.out.println("a < b :" + (a < b));
		System.out.println("a > b :" + (a > b));
		System.out.println("a <=b :" + (a <= b));
		System.out.println("a >= b :" + (a >= b));
	}

}
