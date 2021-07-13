package lesson17;

public class Main {
    public static void main(String[] args) {
        CopyByOnEByte copyByOnEByte = new CopyByOnEByte();

        long startTime1 = System.currentTimeMillis();
        try {


            copyByOnEByte.copyFile("C:\\Users\\rasso\\Downloads\\ideaIU-2021.1.1.exe",
                    "C:\\Users\\rasso\\Downloads\\ideaIU-2021-.1-copy.exe");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();

        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время копирования CopyByOnEByte" + (endTime - startTime1));
    }




}
