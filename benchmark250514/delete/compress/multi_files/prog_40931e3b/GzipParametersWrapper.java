import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setFlags(int flags) {
        /* write */ gzipParameters.setFlags(flags);
    }

    public int getFlags() {
        return gzipParameters.getFlags();
    }
}
