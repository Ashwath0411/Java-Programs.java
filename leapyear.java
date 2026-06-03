import java.util.Scanner;

class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        if (a % 4 == 0 && a % 100 != 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
