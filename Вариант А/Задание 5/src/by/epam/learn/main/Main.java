package by.epam.learn.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите число а = " );
        int a = Integer.parseInt(in.next());
        System.out.printf("Введите число b = " );
        int b = Integer.parseInt(in.next());
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + (a+b));
        System.out.println("Произведение чисел " + a + " и " + b + " равна " + (a*b));
    }
}
