package ex4;

import java.util.Random;

public class EX4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num2 = rd.nextInt(100);
        int num3 = rd.nextInt(1000);

        System.out.printf("ออกรางวัลเลขท้าย 2 ตัว คือ: %02d\n",num2);
        System.out.printf("ออกรางวัลเลขท้าย 2 ตัว คือ: %02d",num3);
    }
}
