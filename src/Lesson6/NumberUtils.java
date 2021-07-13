package Lesson6;

import java.util.Scanner;

public class NumberUtils {
    public static void PrintAreaOfATriangle(double num1, double num2, double num3) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону");
        double i = scanner.nextInt();
        System.out.println("Введите вторую сторону");
        double j = scanner.nextInt();
        System.out.println("Введите третюю сторону");
        double k = scanner.nextInt();
        double p = (i + j + k) / 2;
        double s = Math.sqrt(p * (p - i) * (p - j) * (p - k));


        System.out.println("Площадь треугольна = " + s);

    }

    public static int PrintEvenNumbersOfTheArray(int... numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + "  ");
            }
        }


        return 0;
    }

    public static void PrintSumOfFractions(double numerator1, double numerator2, double denominator1, double denominator2) {
        double sumOfFractions = numerator1 / denominator1 + numerator2 / denominator2;
        System.out.println("Сумма дробей " + sumOfFractions);

    }


}

