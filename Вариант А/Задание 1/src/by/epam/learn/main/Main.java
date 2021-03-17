package by.epam.learn.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    MyClass myClass = new MyClass();
	    System.out.println("Введите ваше имя: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        myClass.OutPutName(name);
    }
}
