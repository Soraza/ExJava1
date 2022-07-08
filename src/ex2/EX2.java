package ex2;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        double d =sc.nextDouble();

        System.out.println("Enter number: ");
        String s = sc.next();

        System.out.println("Enter number: ");
        int i = sc.nextInt();

        System.out.println("NumberDouble is" +d);
        System.out.println("String is" +s);
        System.out.println("NumberInt is" +i);

    }
}
