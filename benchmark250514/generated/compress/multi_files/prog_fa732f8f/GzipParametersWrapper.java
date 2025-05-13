import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParameters;

    public GzipParametersWrapper() {
        this.gzipParameters = new GzipParameters();
    }

    public void setCompressionLevel(int level) {
        /* write */ gzipParameters.setCompressionLevel(level);
    }

    public int getCompressionLevel() {
        return gzipParameters.getCompressionLevel();
    }
}