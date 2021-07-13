package lessen2;

import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        System.out.println("let age");
        Scanner scanner = new Scanner(System.in);
        int inputage = scanner.nextInt();
        System.out.println(inputage);
        if (inputage > 1 && inputage < 10) System.out.println("Вы ребенок");
        if (inputage > 11 && inputage < 18) System.out.println("Вы тинейджер");
        if (inputage> 19 && inputage < 25) System.out.println("Вы молодой");
        if (inputage > 26 && inputage < 35) System.out.println("Вы среднего возраста");
        if (inputage > 36 && inputage < 45) System.out.println("Вы пожилой");
        if (inputage > 46 && inputage < 55) System.out.println("Вы старик");
        if (inputage > 56 && inputage < 90) System.out.println("Вы долгожитель");


    }


}







