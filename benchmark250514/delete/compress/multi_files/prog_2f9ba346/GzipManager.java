import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipManager {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setCompressedSize(long size) {
        /* write */ gzipParameters.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return gzipParameters.getCompressedSize();
    }
}