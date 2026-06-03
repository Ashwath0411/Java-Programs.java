import java.util.Scanner;

class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        if(a > b) {
            System.out.println("Largest number is " + a);
        } else if (a==b) {
            System.out.println("Numbers are equal:");

        } else {
            System.out.println("Largest number is " + b);
        }
    }
}
