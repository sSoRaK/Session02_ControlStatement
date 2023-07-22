import java.util.Scanner;

public class PTBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Phương trình có dạng a * x + b = c ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.printf("Phương trình có 1 nghiệm: %f\n", x);
        } else {
            if (b == c) { // b == c == 0
                System.out.println("Phương trình có vô số nghiệm");
            } else { // b != c
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
