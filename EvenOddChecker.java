import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // สร้าง Scanner เพื่อรับค่าจากผู้ใช้

        System.out.print("Enter number: ");
        int number = input.nextInt(); // อ่านค่าตัวเลขจำนวนเต็มจากผู้ใช้

        if (number % 2 == 0) {
            System.out.println(number + " = Even number.");
        } else {
            System.out.println(number + " = Odd number.");
        }

        input.close(); // ปิด Scanner เมื่อใช้งานเสร็จ
    }
}
