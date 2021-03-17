package by.epam.learn.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    MyMetod myMetod = new MyMetod();
        Scanner in = new Scanner(System.in);
        System.out.println("Время и дата получения задания: ");
        myMetod.gettingOfTask();
        System.out.println();
        System.out.print("Введите имя и фамилию разработчика: ");
        String name = in.nextLine();
        myMetod.Name(name);
        myMetod.endOfTask();
    }
}
