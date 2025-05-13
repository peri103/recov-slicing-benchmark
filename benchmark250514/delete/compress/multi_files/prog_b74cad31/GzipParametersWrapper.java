import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setGzipFlags(int flags) {
        /* write */ gzipParameters.setFlags(flags);
    }

    public int getGzipFlags() {
        return gzipParameters.getFlags();
    }
}
