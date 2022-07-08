package ex3;

import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ป้อนชื่อ>> ");
        String fname =sc.next();

        System.out.println("ป้อนชื่อ>> ");
        int age = sc.nextInt();

        System.out.println("ป้อนชื่อ>> ");
        String address = sc.next();

        System.out.printf("ชื่อ: %s, อายุ: %d, ที่อยู่: %s", fname, age, address);

    }
}
