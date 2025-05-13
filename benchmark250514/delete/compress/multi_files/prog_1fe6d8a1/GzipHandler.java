import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipHandler {
    private GzipParameters gzipParams;

    public GzipHandler() {
        this.gzipParams = new GzipParameters();
    }

    public void setExtraFlags(int flags) {
        /* write */ gzipParams.setExtraFlags(flags);
    }

    public int getExtraFlags() {
        return gzipParams.getExtraFlags();
    }
}