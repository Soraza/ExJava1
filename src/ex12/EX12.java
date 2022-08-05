package ex12;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EX12 {
    public static void main(String[] args) {
        // Method in class Math
//        System.out.println("Math.pow(3,2) = " + Math.pow(3,2));
//        System.out.println("Math.sqr(9) = " + Math.sqrt(9));
//        System.out.println("Math.max(5,10) = " + Math.max(5,10));
        // Method in class Calendar
        Calendar calen = Calendar.getInstance();
        System.out.println("Current Datetime: " + calen.getTime());

        // format DateTime in Class SimpleDateFormat
        SimpleDateFormat df = new SimpleDateFormat("d/MM/yyyy HH:mm:ss");
        System.out.println("Current Datetime: " + df.format(calen.getTime()));

    }
}
