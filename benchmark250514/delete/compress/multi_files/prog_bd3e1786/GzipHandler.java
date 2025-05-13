import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipHandler {
    private GzipParameters gzipParams;

    public GzipHandler() {
        this.gzipParams = new GzipParameters();
    }

    public void setISize(int size) {
        /* write */ gzipParams.setISize(size);
    }

    public int getISize() {
        return gzipParams.getISize();
    }
}