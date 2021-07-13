package Lesson5;

import java.util.concurrent.ThreadLocalRandom;

public class Lesson5Dz1 {
    public static void main(String[] args) {
        int[][] saper = new int[10][10];
        for (int x = 0; x <= 10; x++) {
            int randomRow = ThreadLocalRandom.current().nextInt(0, saper.length);
            int randomNum = ThreadLocalRandom.current().nextInt(0, saper[0].length);
            saper[randomRow][randomNum] = -1;

        }
        for (int y = 0; y < 10; y++) {
            int randomNumX = ThreadLocalRandom.current().nextInt(0, saper.length);
            int randomNumZ = ThreadLocalRandom.current().nextInt(0, saper[0].length);
            saper[randomNumX][randomNumZ] = 2;
        }

        for (int x = 0; x < saper.length; x++) {
            for (int y = 0; y < saper[x].length; y++) {
                System.out.print(saper[x][y] + "  ");
            }
            System.out.println();


        }


    }
}
