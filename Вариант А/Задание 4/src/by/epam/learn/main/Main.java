package by.epam.learn.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyMetod myMetod = new MyMetod();
        System.out.println("Пароль (Olga212002)");
        System.out.println("Для входа в систему повторите пароль что в скобках: ");
        Scanner in = new Scanner(System.in);
        String passort = in.next();
        myMetod.ProverkaPassort(passort);
    }
}
