package lesson19;

import lesson17.CopyByOnEByte;

public class CopyFileTaskImpl extends AbstractTask implements CopyFileTask {
    private String From;
    private String to;
    private FileCopyUtils copyUtils;

    public CopyFileTaskImpl(String from, String to) {
        From = from;
        this.to = to;

    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.copyUtils = copyUtils;


    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        try {copyUtils.copyFile(From,to);

        }catch (Exception e){throw  new TaskExecutionFailedException(e.getMessage());

        }

    }

    @Override
    public void setFileCopyUtils(CopyByOnEByte copyByOnEByte) {

    }
}
