package lesson4;

public class Dz3Lesson4 {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) {
                System.out.println(numbers[i]);
            }
        }


    }
}
