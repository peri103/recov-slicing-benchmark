import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipHelper {
    private GzipParameters gzipParameters;

    public GzipHelper() {
        this.gzipParameters = new GzipParameters();
    }

    public void setFilename(String filename) {
        /* write */ gzipParameters.setFilename(filename);
    }

    public String getFilename() {
        return gzipParameters.getFilename();
    }
}
