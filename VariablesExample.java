import java.util.Scanner; // 

public class VariablesExample { //
    public static void main(String[] args) { //

        Scanner scanner = new Scanner(System.in); // สร้างวัตถุ scanner สำหรับรับค่าจากแป้นพิมพ์

        // รับค่าขนาดเสื้อจากผู้ใช้
        System.out.print("Enter clothing size (S, M, L): ");
        char clothingSize = scanner.next().toUpperCase().charAt(0); // รับค่าจากผู้ใช้ และแปลงเป็นตัวอักษรใหญ่ตัวแรก

        // รับจำนวนผู้เข้าชมเว็บไซต์
        System.out.print("Enter number of website visitors: ");
        int websiteVisitors = scanner.nextInt(); // รับค่าเป็นจำนวนเต็ม

        // รับเกรดของนักศึกษา
        System.out.print("Enter student grade (A, B, C, D, E): ");
        char studentGrade = scanner.next().toUpperCase().charAt(0); // รับค่าตัวอักษรและแปลงเป็นตัวพิมพ์ใหญ่

        // รับเกรดเฉลี่ยของนักศึกษา
        System.out.print("Enter student GPA (e.g. 3.25): ");
        double studentGPA = scanner.nextDouble(); // รับค่าทศนิยมแบบ double

        // รับค่าใช้จ่ายรายปีของนักศึกษา
        System.out.print("Enter annual expenses (e.g. 15000.00): ");
        float annualExpenses = scanner.nextFloat(); // รับค่าทศนิยมแบบ float

        // กำหนดค่าคงที่ของ Pi และจำนวนเดือนในหนึ่งปี
        final double PI = 3.14159; // ค่าคงที่ของ Pi ใช้ในการคำนวณวงกลม
        final int MONTHS_IN_YEAR = 12; // จำนวนเดือนใน 1 ปี

        // แสดงผลลัพธ์ทั้งหมดที่ได้รับจากผู้ใช้
        System.out.println("\n--- Summary ---"); // หัวข้อสรุปผล
        System.out.println("Clothing Size: " + clothingSize); // แสดงขนาดเสื้อ
        System.out.println("Website Visitors: " + websiteVisitors); // แสดงจำนวนผู้ชมเว็บ
        System.out.println("Student Grade: " + studentGrade); // แสดงเกรด
        System.out.println("Student GPA: " + studentGPA); // แสดง GPA
        System.out.println("Annual Expenses: " + annualExpenses); // แสดงค่าใช้จ่ายรายปี
        System.out.println("Monthly Expenses: " + (annualExpenses / MONTHS_IN_YEAR)); // คำนวณค่าใช้จ่ายรายเดือน
        System.out.println("Value of Pi: " + PI); // แสดงค่าของ Pi
        System.out.println("Months in a Year: " + MONTHS_IN_YEAR); // แสดงจำนวนเดือนในปี

        scanner.close(); // ปิด Scanner เพื่อคืนทรัพยากร
    }
}
