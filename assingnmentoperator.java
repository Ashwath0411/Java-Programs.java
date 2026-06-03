import java.util.Scanner;

public class assignment {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int a = sc.nextInt();
        a+=5;
        System.out.println("add:"+a);
        a-=5;
        System.out.println("sub:"+a);
        a*=5;
        System.out.println("Mult:"+a);
        a/=5;
        System.out.println("div:"+a);
    }
