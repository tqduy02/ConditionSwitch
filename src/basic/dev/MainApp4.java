package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Nhap cac he so cua phuong trinh bac 2");
	        System.out.print("Nhap a: ");
	        double a = sc.nextDouble();
	        System.out.print("Nhap b: ");
	        double b = sc.nextDouble();
	        System.out.print("Nhap c: ");
	        double c = sc.nextDouble();

	        double delta = b * b - 4 * a * c;
	        switch (kiemTraDelta(delta)) {
	            case 1:
	                System.out.println("Phuong trinh co 2 nghiem phan biet");
	                break;
	            case 0:
	                System.out.println("Phuong trinh co nghiem kep");
	                break;
	            default:
	                System.out.println("Phuong trinh vo nghiem");
	                break;
	        }

	        sc.close();
	    }

	   	static int kiemTraDelta(double delta) {
	        if (delta > 0) {
	            return 1;
	        } else if (delta == 0) {
	            return 0;
	        } else {
	            return -1;
	        }

	}

}
