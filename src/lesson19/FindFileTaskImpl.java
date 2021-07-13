package lesson19;

import lesson17.CopyByOnEByte;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFileTaskImpl extends AbstractTask implements FindFilesTask{
    private String directory;
    private  String searchString;
    private PrintStream out;

    @Override
    public void setFileCopyUtils(CopyByOnEByte copyByOnEByte) {

    }


    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        this.directory=directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString=searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out=out;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        File stardDir = new File(directory);
        if (!stardDir.exists()){
            throw new TaskExecutionFailedException("такой директории несуществует");
        }



        };

    }



