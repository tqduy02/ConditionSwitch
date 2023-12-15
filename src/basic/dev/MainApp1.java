package basic.dev;

import java.util.Scanner;

public class MainApp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.print("Nhap mot so nguyen: ");
		int n = sc.nextInt();

		switch (kiemTraSoNguyen(n)) {
		case 1:
			System.out.println(n + " la so nguyen duong");
			break;
		case -1:
			System.out.println(n + " la so nguyen am");
			break;
		default:
			System.out.println(n + " khong phai la so nguyen duong hay am");
			break;
		}
		sc.close();
	    }

		static int kiemTraSoNguyen(int n) {
			if (n > 0) {
				return 1;
			} else if (n < 0) {
				return -1;
			} else {
				return 0;
			}
		}
}