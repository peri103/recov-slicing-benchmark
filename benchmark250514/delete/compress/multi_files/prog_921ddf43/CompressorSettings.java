import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class CompressorSettings {
    private BZip2CompressorInputStream bzip2InputStream;

    public CompressorSettings(BZip2CompressorInputStream bzip2InputStream) {
        this.bzip2InputStream = bzip2InputStream;
    }

    public void setBlockSize(int size) {
        /* write */ bzip2InputStream.setBlockSize(size);
    }

    public int getBlockSize() {
        return bzip2InputStream.getBlockSize();
    }
}
