import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class BZip2Compressor {
    private BZip2CompressorInputStream bzip2Stream;

    public BZip2Compressor(BZip2CompressorInputStream stream) {
        this.bzip2Stream = stream;
    }

    public void setBlockSize(int size) {
        /* write */ bzip2Stream.setBlockSize(size);
    }

    public int getBlockSize() {
        return bzip2Stream.getBlockSize();
    }
}