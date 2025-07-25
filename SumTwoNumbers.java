import java.util.Scanner; // นำเข้า Scanner

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // สร้าง Scanner เพื่อรับค่าจากผู้ใช้

        System.out.print("Enter num 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num 2: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("ผลรวมของ " + num1 + " และ " + num2 + " คือ " + sum);

        input.close(); // ปิด Scanner เมื่อใช้งานเสร็จ
    }
}
