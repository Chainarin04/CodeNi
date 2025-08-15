import java.util.Scanner;

public class BodySurfaceAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับค่าความกว้าง
        System.out.print("Enter the width value: ");
        double width = input.nextDouble();

        // รับค่าความยาว
        System.out.print("Enter the length value: ");
        double length = input.nextDouble();

        // คำนวณ Body Surface Area
        double bsa = (width * length) / 360;

        // แสดงผล
        System.out.println("ค่าความกว้าง: = " + width);
        System.out.println("ค่าความยาว: = " + length);
        System.out.println("ค่า Body Surface Area = " + bsa);

        input.close();
    }
}
