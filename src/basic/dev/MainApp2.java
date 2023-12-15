package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
				
		System.out.print("Nhap mot so nguyen: ");
		int n = sc.nextInt();
		
		int layDu = n % 3;
        switch (layDu) {
            case 0:
                System.out.println(n + " chia het cho 3");
                break;
            default:
                layDu = n % 5;
                switch (layDu) {
                    case 0:
                        System.out.println(n + " chia het cho 5");
                        break;
                    default:
                        System.out.println(n +  " khong chia het cho 3 va 5");
                        break;
                }
                break;
        }

        sc.close();
			
		}
}