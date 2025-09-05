import java.util.Scanner;

public class ChoiceProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้าง Scanner สำหรับรับค่าจากผู้ใช้

        System.out.println("Please select a menu:"); // แสดงเมนู
        System.out.println("1: Calculate area of a triangle"); // เมนู 1: คำนวณพื้นที่สามเหลี่ยม
        System.out.println("2: Calculate BMI"); // เมนู 2: คำนวณค่า BMI
        System.out.print("Enter your choice: "); // ให้ผู้ใช้เลือกเมนู
        int choice = sc.nextInt(); // เก็บค่าที่ผู้ใช้เลือกไว้ในตัวแปร choice

        if (choice == 1) {
            // --- Calculate area of triangle ---
            System.out.print("Enter base: "); // รับค่าฐานของสามเหลี่ยม
            double base = sc.nextDouble();

            System.out.print("Enter height: "); // รับค่าความสูงของสามเหลี่ยม
            double height = sc.nextDouble();

            double area = 0.5 * base * height; // สูตรคำนวณพื้นที่สามเหลี่ยม
            System.out.println("The area of the triangle is: " + area); // แสดงผลลัพธ์

        } else if (choice == 2) {
            // --- Calculate BMI ---
            System.out.print("Enter weight (kg): "); // รับค่าน้ำหนัก
            double weight = sc.nextDouble();

            System.out.print("Enter height (m): "); // รับค่าส่วนสูง
            double height = sc.nextDouble();

            double bmi = weight / (height * height); // สูตรคำนวณ BMI
            System.out.println("Your BMI is: " + bmi); // แสดงค่า BMI

        } else {
            System.out.println("Invalid choice!"); // กรณีผู้ใช้เลือกเมนูไม่ถูกต้อง
        }

        System.out.println("End of Program."); // แสดงข้อความว่าจบโปรแกรม
        sc.close(); // ปิด Scanner
    }
}
