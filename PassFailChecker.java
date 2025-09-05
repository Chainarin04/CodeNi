import java.util.Scanner;

public class PassFailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับคะแนนกลางภาค
        System.out.print("Enter your midterm score: ");
        double midterm = sc.nextDouble();

        // รับคะแนนปลายภาค
        System.out.print("Enter your final exam score: ");
        double finalExam = sc.nextDouble();

        // รวมคะแนน (สามารถปรับสูตรได้ตามต้องการ)
        double totalScore = midterm + finalExam;

        // ตรวจสอบว่าผ่านหรือไม่
        if (totalScore >= 50) {
            System.out.println("Your total score is  " + totalScore + "  The result is Pass!!");
        } else {
            System.out.println("Your total score is  " + totalScore + "  The result is Fail!!");
        }

        sc.close();
    }
}
