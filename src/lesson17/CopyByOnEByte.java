package lesson17;

import java.io.*;

public class CopyByOnEByte implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

        File descFile = new File(destination);
        if (descFile.exists()) {
            throw new FileAlreadyExistsException("Целевой файл уже существует!!!");

        }
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination));

            int c = 0;
            while (true) {
                c = bis.read();
                if (c != -1)
                    bos.write(c);
                else
                    break;
            }
            bis.close();
            bos.flush(); //освобождаем буфер (принудительно записываем содержимое буфера в файл)
            bos.close(); //закрываем поток записи (обязательно!)
        } catch (java.io.IOException e) {
            throw new FileAlreadyExistsException(e.getMessage());
        }
    }

    @Override
    public void copyFileNio(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

    }
}
