import java.util.Scanner;

public class NoteChange_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับจำนวนเงินที่ต้องจ่าย
        System.out.print("Enter total amount to pay: ");
        int amountToPay = input.nextInt();

        // รับจำนวนเงินที่ลูกค้าจ่าย
        System.out.print("Enter amount paid by customer: ");
        int amountPaid = input.nextInt();

        // ตรวจสอบว่าลูกค้าจ่ายพอหรือไม่
        if (amountPaid < amountToPay) {
            System.out.println("Error: Customer paid less than the total amount.");
            return; // จบโปรแกรม ถ้าจ่ายไม่พอ
        }

        // คำนวณเงินทอน
        int change = amountPaid - amountToPay;
        System.out.println("Change to give back: " + change + " baht");

        // ประเภทของธนบัตรและเหรียญ (เรียงจากค่ามาก -> ค่าน้อย)
        int[] moneyValues = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
        String[] moneyNames = {
                "1000-baht note",
                "500-baht note",
                "100-baht note",
                "50-baht note",
                "20-baht note",
                "10-baht coin",
                "5-baht coin",
                "2-baht coin",
                "1-baht coin"
        };

        // แสดงจำนวนธนบัตรและเหรียญที่ใช้ในการทอน
        for (int i = 0; i < moneyValues.length; i++) {
            int count = change / moneyValues[i]; // หาว่าใช้กี่ใบ/เหรียญ
            change = change % moneyValues[i]; // คำนวณเงินที่เหลือ

            if (count > 0) {
                System.out.println(moneyNames[i] + ": " + count);
            }
        }

        input.close(); // ปิด Scanner
    }
}
