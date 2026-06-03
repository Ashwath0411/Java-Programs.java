import java.util.Scanner;

public class unary {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int a = sc.nextInt();
        System.out.println("Increament:" + (++a));
        System.out.println("Decreament:" + (--a));
        System.out.println("Negative:" + (-a));
    }
}
