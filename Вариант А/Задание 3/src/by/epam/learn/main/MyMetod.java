package by.epam.learn.main;

import sun.nio.cs.ext.MacArabic;

import java.util.Random;

public class MyMetod {
    //Вывод чисел в одну строку через пробел
    public void OutPutLine(int n){
        System.out.println("Вывод чисел в одну строку через пробел");
        for(int i = 0; i <= n; i++){
            System.out.print(getRandomNumber() + " ");
        }
    }

    public void OutPutAllLine(int n){
        System.out.println("Вывод чисел в каждую строку:");
        for (int i = 0; i <= n; i++){
            System.out.println(getRandomNumber());
        }
    }

    public static int getRandomNumber(){
        Random r = new Random();
        int x  = r.nextInt();
        return x;
    }
}
