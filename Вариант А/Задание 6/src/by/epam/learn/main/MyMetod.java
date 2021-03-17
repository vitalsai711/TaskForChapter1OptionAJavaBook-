package by.epam.learn.main;

import java.util.Date;

public class MyMetod {



    public void gettingOfTask(){
        Date date = new Date();
        System.out.printf(date.toString());
    }

    public void Name(String name){
        System.out.println("Добро пожаловать, " + name);
    }

    public void endOfTask(){
        Date date = new Date();
        System.out.printf(date.toString());
    }
}
