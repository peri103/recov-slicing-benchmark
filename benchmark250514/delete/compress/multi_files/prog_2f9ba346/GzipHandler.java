import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipHandler {
    private GzipParameters gzipParameters;

    public GzipHandler() {
        this.gzipParameters = new GzipParameters();
    }

    public void setCompressedSize(long size) {
        /* write */ gzipParameters.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return gzipParameters.getCompressedSize();
    }
}