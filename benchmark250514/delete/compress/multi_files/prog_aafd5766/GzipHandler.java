import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipHandler {
    private GzipParameters gzipParams;

    public GzipHandler() {
        this.gzipParams = new GzipParameters();
    }

    public void setCRC32Value(long crcValue) {
        /* write */ gzipParams.setCRC32(crcValue);
    }

    public long getCRC32Value() {
        return gzipParams.getCRC32();
    }
}
