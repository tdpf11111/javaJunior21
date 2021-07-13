package lesson17;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyNIO implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

    }

    @Override
    public void copyFileNio(String source, String destination) throws FileCopyFailedException,
            FileAlreadyExistsException {
        File descFile = new File(destination);
        if (descFile.exists()) {
            throw new FileAlreadyExistsException("Целевой файл уже существует!!!");

        }
        try {
            Path sorcePath = Paths.get(source),destinationPath = Paths.get(destination);
            Files.copy(sorcePath,destinationPath, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException exception) {
            System.out.println("Input/ output error");
        }


    }
}
