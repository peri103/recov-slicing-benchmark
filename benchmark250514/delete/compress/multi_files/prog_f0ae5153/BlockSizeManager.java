import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

public class BlockSizeManager {
    private BZip2CompressorInputStream bzip2Stream;

    public BlockSizeManager() throws Exception {
        // Initialize the BZip2CompressorInputStream with a dummy InputStream
        this.bzip2Stream = new BZip2CompressorInputStream(new java.io.ByteArrayInputStream(new byte[0]));
    }

    public void setBlockSize(int size) {
        /* write */ bzip2Stream.setBlockSize(size);
    }

    public int getBlockSize() {
        /* read */ return bzip2Stream.getBlockSize();
    }
}
