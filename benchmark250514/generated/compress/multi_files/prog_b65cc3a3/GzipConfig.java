import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipConfig {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setFilename(String filename) {
        /* write */ gzipParameters.setFilename(filename);
    }

    public String getFilename() {
        return gzipParameters.getFilename();
    }
}
