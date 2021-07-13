package lesson4;

public class Dz5Lesson4 {
    public static void main(String[] args) {
        String text = new String("Я буду учиться лучше ");

        String[] textSlova = text.split(" ");

        for (int i = textSlova.length - 1; i >= 0; i--) {
            System.out.println(textSlova[i]);

        }


    }


}

