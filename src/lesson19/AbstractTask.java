package lesson19;

import lesson17.CopyByOnEByte;

public  abstract class AbstractTask implements Task{
    private int tryCount;


        @Override
        public int getTryCount() {
            return tryCount;
        }

        @Override
        public void incTryCount() {
            tryCount++;

        }

    public abstract void setFileCopyUtils(CopyByOnEByte copyByOnEByte);
}

