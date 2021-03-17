package by.epam.learn.main;

public class MyMetod {
    private String Passort = "Olga212002";
    private String[] massive;

    public void ProverkaPassort(String passort){
        try {
            String[] masspassort = passort.split("");
            massive = Passort.split("");
            int k = 0;
            for (int i = 0; i < massive.length; i++){
                char a = massive[i].charAt(0);
                char b = masspassort[i].charAt(0);
                if(a == b) k++;
                else k = 0;
            }
            if (k == massive.length) System.out.println("Добро пожаловать в систему!");
            else System.out.println("Неверно введён пароль");
        } catch (Exception ex){
            System.out.println("Неверно введён пароль");
        }

    }
}
