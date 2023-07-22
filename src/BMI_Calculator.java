import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số cân nặng");
        double weight = scanner.nextDouble();
        System.out.println("Nhập chỉ số chiều cao");
        double height = scanner.nextDouble();
        double bmi = (weight / Math.pow(height, 2)) * 10000;

        if (bmi < 18.5) {
            System.out.printf("%.2f: Underweight\n", bmi);
        } else if (bmi < 25.0) {
            System.out.printf("%.2f: Normal\n", bmi);
        } else if (bmi < 30.0) {
            System.out.printf("%.2f: Overweight\n", bmi);
        } else {
            System.out.printf("%.2f: Obese\n", bmi);
        }
    }
}
