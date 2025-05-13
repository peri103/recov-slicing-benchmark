import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipConfig {
    private GzipParameters gzipParameters;

    public GzipConfig() {
        this.gzipParameters = new GzipParameters();
    }

    public void setFlags(int flags) {
        /* write */ gzipParameters.setFlags(flags);
    }

    public int getFlags() {
        return gzipParameters.getFlags();
    }
}
