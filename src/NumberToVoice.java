import java.util.Scanner;

public class NumberToVoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = scanner.nextInt();

        int hundreds = number / 100; // lấy hàng trăm
        System.out.println("A: " + hundreds);
        int dozens = (number % 100) / 10; // lấy hàng chục
        System.out.println("A: " + dozens);
        int units = number % 10; // lấy hàng đơn vị
        System.out.println("A: " + units);
        String str_hundreds = "", str_dozens = "", str_units, str_result = "";
        switch (units) {
            case 0:
                str_units = "Zero";
                break;
            case 1:
                str_units = "One";
                break;
            case 2:
                str_units = "Two";
                break;
            case 3:
                str_units = "Three";
                break;
            case 4:
                str_units = "Four";
                break;
            case 5:
                str_units = "Five";
                break;
            case 6:
                str_units = "Six";
                break;
            case 7:
                str_units = "Seven";
                break;
            case 8:
                str_units = "Eight";
                break;
            default:
                str_units = "Nine";
                break;
        }
        switch (dozens) {
            case 1:
                switch (units) {
                    case 0:
                        str_dozens = "Ten";
                        break;
                    case 1:
                        str_dozens = "Eleven";
                        break;
                    case 2:
                        str_dozens = "Twelve";
                        break;
                    default:
                        str_dozens = str_units + "teen";
                        break;
                }
                break;
            case 2:
                str_dozens = "Twenty";
                break;
            case 3:
                str_dozens = "Thirty";
                break;
            case 4:
                str_dozens = "Forty";
                break;
            case 5:
                str_dozens = "Fifty";
                break;
            case 6:
                str_dozens = "Sixty";
                break;
            case 7:
                str_dozens = "Seventy";
                break;
            case 8:
                str_dozens = "Eighty";
                break;
            case 9:
                str_dozens = "Ninety";
                break;
        }
        if (number < 10) {
            str_result = str_units;
        } else if (number < 20) {
            str_result = str_dozens;
        } else if (number < 100) {
            if (units == 0) {
                str_result = str_dozens;
            } else {
                str_result = str_dozens + " " + str_units;
            }
        } else if (number < 1000) {
            switch (hundreds) {
                case 1:
                    str_hundreds = "One ";
                    break;
                case 2:
                    str_hundreds = "Two";
                    break;
                case 3:
                    str_hundreds = "Three";
                    break;
                case 4:
                    str_hundreds = "Four";
                    break;
                case 5:
                    str_hundreds = "Five";
                    break;
                case 6:
                    str_hundreds = "Six";
                    break;
                case 7:
                    str_hundreds = "Seven";
                    break;
                case 8:
                    str_hundreds = "Eight";
                    break;
                case 9:
                    str_hundreds = "Nine";
                    break;
            }
            str_hundreds = str_hundreds + "Hundred";
            if (dozens == 0) {
                if (units == 0) {
                    str_result = str_hundreds;
                } else {
                    str_result = str_hundreds + " " + str_units;
                }
            } else if (dozens == 1) {
                str_result = str_hundreds + " " + str_dozens;
            } else {
                if (units == 0) {
                    str_result = str_hundreds + " " + str_dozens;
                } else {
                    str_result = str_hundreds + " and " + str_dozens + " " + str_units;
                }
            }
        }
        System.out.printf("Kết quả: %s\n", str_result);
    }
}
