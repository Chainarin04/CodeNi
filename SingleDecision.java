import java.util.Scanner;

public class SingleDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("กรอกตัวเลข: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("จำนวนเต็มบวก");
        } else {
            System.out.println("จำนวนเต็มลบ");
        }
        System.out.println("จบโปรแกรม");
        sc.close(); //
    }
}
