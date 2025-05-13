import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipManager {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setCompressionFlags(int flags) {
        /* write */ gzipParameters.setFlags(flags);
    }

    public int getCompressionFlags() {
        return gzipParameters.getFlags();
    }
}
