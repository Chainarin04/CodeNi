import java.util.Scanner;

public class BMRCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลเพศ
        System.out.print("Enter your gender (male/female): ");
        String gender = sc.nextLine(); // gender

        // รับข้อมูลน้ำหนัก (กิโลกรัม)
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble(); // weight

        // รับข้อมูลส่วนสูง (เซนติเมตร)
        System.out.print("Enter your height in cm: ");
        double height = sc.nextDouble(); // height

        // รับข้อมูลอายุ
        System.out.print("Enter your age in years: ");
        int age = sc.nextInt(); // age

        double bmr;

        // คำนวณ BMR ตามสูตร
        if (gender.equalsIgnoreCase("male")) {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else {
            bmr = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }

        // แสดงผล BMR
        System.out.println("Your BMR is: " + bmr + " calories/day");

        sc.close();
    }
}
