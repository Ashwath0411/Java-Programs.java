import java.util.Scanner;

public class ternary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int b = sc.nextInt();
        int max = (b > a) ? b : a;
        System.out.println("largest no  :  7" + max);
    }
}
