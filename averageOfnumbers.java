import java.util.Scanner;

public class average {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        System.out.println("average="+ ((a+b+c)/3));

    }
}
