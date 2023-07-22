import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số năm: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d là năm nhuận\n", year);
                } else {
                    System.out.printf("%d không phải là năm nhuận\n", year);
                }
            } else {
                System.out.printf("%d là năm nhuận\n", year);
            }
        } else {
            System.out.printf("%d không phải là năm nhuận\n", year);
        }
    }
}
