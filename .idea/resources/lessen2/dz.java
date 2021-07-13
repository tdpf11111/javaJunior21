package lessen2;

import java.util.Scanner;

public class dz {
    public static void main(String[] args) {
        System.out.println("let age");
        Scanner scanner = new Scanner(System.in);
        int inputA = scanner.nextInt();
        System.out.println(inputA);
        System.out.println("age");
        int m = inputA;
        if (m > 1 && m < 10) System.out.println("Вы ребенок");
        if (m > 11 && m < 18) System.out.println("Вы тинейджер");
        if (m > 19 && m < 25) System.out.println("Вы молодой");
        if (m > 26 && m < 35) System.out.println("Вы среднего возраста");
        if (m > 36 && m < 45) System.out.println("Вы пожилой");
        if (m > 46 && m < 55) System.out.println("Вы старик");
        if (m > 56 && m < 90) System.out.println("Вы долгожитель");


    }


}







