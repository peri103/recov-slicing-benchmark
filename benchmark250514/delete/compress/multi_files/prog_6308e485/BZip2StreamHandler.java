import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class BZip2StreamHandler {
    private BZip2CompressorInputStream bzip2Stream;

    public BZip2StreamHandler(BZip2CompressorInputStream bzip2Stream) {
        this.bzip2Stream = bzip2Stream;
    }

    public void setBlockSize(int size) {
        /* write */ bzip2Stream.setBlockSize(size);
    }

    public int getBlockSize() {
        /* read */ return bzip2Stream.getBlockSize();
    }
}
