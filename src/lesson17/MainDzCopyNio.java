package lesson17;

public class MainDzCopyNio {
    public static void main(String[] args) {
        CopyNIO copyNIO = new CopyNIO();
        long startTime1 = System.currentTimeMillis();
        try {copyNIO.copyFileNio("C:\\Users\\rasso\\Downloads\\ideaIU-2021.1.1.exe",
                "C:\\Users\\rasso\\Downloads\\ideaIU705.exe");

        }catch (FileCopyFailedException e) {
            e.printStackTrace();
    }
        long endTime = System.currentTimeMillis();
        System.out.println("Время копирования CopyNIO" + (endTime - startTime1));
}}
