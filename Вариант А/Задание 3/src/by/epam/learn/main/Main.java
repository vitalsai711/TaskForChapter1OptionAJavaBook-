package by.epam.learn.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    MyMetod myMetod = new MyMetod();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое положительное число: ");
        int n = Integer.parseInt(in.next());
        myMetod.OutPutAllLine(n);
        myMetod.OutPutLine(n);
    }
}
