import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();

        // คำนวณผลลัพธ์
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;

        // ตรวจสอบการหารด้วยศูนย์
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("ผลบวก: " + sum);
            System.out.println("ผลลบ: " + diff);
            System.out.println("ผลคูณ: " + product);
            System.out.printf("ผลหาร: %.2f\n", quotient); // แสดงผลหารเป็นทศนิยม 2 ตำแหน่ง
        } else {
            System.out.println("ผลบวก: " + sum);
            System.out.println("ผลลบ: " + diff);
            System.out.println("ผลคูณ: " + product);
            System.out.println("ผลหาร: ไม่สามารถหารด้วยศูนย์ได้");
        }
    }
}
