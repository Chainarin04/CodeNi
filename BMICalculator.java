import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับน้ำหนักจากผู้ใช้
        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();

        // รับความสูงจากผู้ใช้
        System.out.print("Enter height (meters): ");
        double height = input.nextDouble();

        // คำนวณค่า BMI
        double bmi = weight / (height * height);

        // แสดงผล พร้อมค่าน้ำหนักและความสูง
        System.out.println("Your weight: " + weight + " kg.");
        System.out.println("Your height: " + height + " meters");
        System.out.println("Your BMI = " + bmi);

        input.close();
    }
}