import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tháng: ");
        byte month = scanner.nextByte();
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    System.out.println("Nhập vào số năm: ");
                    int year = scanner.nextInt();
                    byte daysOfFeb = 28;
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        System.out.printf("Năm %d, tháng 2 có %d\n", year, daysOfFeb + 1);
                    } else {
                        System.out.printf("Năm %d, tháng 2 có %d\n", year, daysOfFeb);
                    }
                    break;

                case 4:
                    System.out.println("Tháng 4 có 30 ngày");
                    break;
                case 6:
                    System.out.println("Tháng 6 có 30 ngày");
                    break;
                case 9:
                    System.out.println("Tháng 9 có 30 ngày");
                    break;
                case 11:
                    System.out.println("Tháng 11 có 30 ngày");
                    break;
                default:
                    System.out.printf("Tháng $d có 31 ngày", month);
                    break;
            }
        } else {
            System.out.println("Nhập lại tháng");
        }
    }
}
