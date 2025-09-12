import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับราคาสินค้า
        System.out.print("Enter product price: ");
        int price = scanner.nextInt();

        // รับจำนวนสินค้า
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        // คำนวณเงินรวมที่ต้องจ่าย
        int total = price * quantity;

        // รับเงินที่ลูกค้าจ่ายจริง
        System.out.print("Enter amount paid by customer: ");
        int customerMoney = scanner.nextInt();

        // ตรวจสอบเงินว่าพอไหม
        if (customerMoney < total) {
            System.out.println("Not enough money!!");
            scanner.close();
            return; // จบโปรแกรมถ้าเงินไม่พอ
        }

        // คำนวณเงินทอน
        int change = customerMoney - total;
        System.out.println("Total to pay: " + total + " baht");
        System.out.println("Customer paid: " + customerMoney + " baht");
        System.out.println("Change: " + change + " baht");

        // กำหนดธนบัตรและเหรียญ
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

        // แจกแจงเงินทอน
        for (int i = 0; i < moneyValues.length; i++) {
            int count = change / moneyValues[i]; // หาจำนวนแบงค์/เหรียญที่ใช้
            change = change % moneyValues[i]; // คำนวณเงินเหลือ

            if (count > 0) {
                System.out.println(moneyNames[i] + ": " + count);
            }
        }

        scanner.close();
    }
}
