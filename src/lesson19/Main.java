package lesson19;

import lesson17.CopyByOnEByte;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("C:\\Users\\rasso\\Downloads\4442321312.exe",
                "C:\\Users\\rasso\\Downloads\4442321312---1.exe");
        task1.setFileCopyUtils(new CopyByOnEByte());
        CopyFileTaskImpl task2 = new CopyFileTaskImpl("C:\\Users\\rasso\\Downloads\111222.exe",
                "C:\\Users\\rasso\\Downloads\111222-2.exe");
        task2.setFileCopyUtils(new CopyByOnEByte());
        CopyFileTaskImpl task3 = new CopyFileTaskImpl("C:\\Users\\rasso\\Downloads\222333.exe",
                "C:\\Users\\rasso\\Downloads\222333--3.exe");
        task3.setFileCopyUtils(new CopyByOnEByte());
        CopyFileTaskImpl task4 = new CopyFileTaskImpl("C:\\Users\\rasso\\Downloads\444411.exe",
                "C:\\Users\\rasso\\Downloads\444411--4.exe");
        task4.setFileCopyUtils(new CopyByOnEByte());
        CopyFileTaskImpl task5 = new CopyFileTaskImpl("C:\\Users\\rasso\\Downloads1\2222111.exe",
                "C:\\Users\\rasso\\Downloads\2222111---5.exe");
        task5.setFileCopyUtils(new CopyByOnEByte());


        FindFileTaskImpl task6 = new FindFileTaskImpl();
        try {
            task6.setDirectory("C:\\Users\\rasso\\Downloads");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        task6.setFileNameSearchString("1234");
        task6.setPrintStream(System.out);

        FindFileTaskImpl task7 = new FindFileTaskImpl();
        try {
            task7.setDirectory("C:\\Users\\rasso\\Downloads");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        task7.setFileNameSearchString("12346");
        task7.setPrintStream(System.out);


        TaskStorageImpl storage = new TaskStorageImpl();
        storage.add(task1);
        storage.add(task2);
        storage.add(task3);
        storage.add(task4);
        storage.add(task5);
        storage.add(task6);
        storage.add(task7);

        TaskExecutor executor1 = new TaskExecutorImpl();
        executor1.setStorage(storage);

        TaskExecutor executor2 = new TaskExecutorImpl();
        executor2.setStorage(storage);

        TaskExecutor executor3 = new TaskExecutorImpl();
        executor3.setStorage(storage);


        executor1.start();
        executor2.start();
        executor3.start();
    }
}
