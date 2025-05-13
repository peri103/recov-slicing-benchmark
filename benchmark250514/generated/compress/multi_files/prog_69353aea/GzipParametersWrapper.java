import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParams = new GzipParameters();

    public void setFilename(String filename) {
        /* write */ gzipParams.setFilename(filename);
    }

    public String getFilename() {
        return gzipParams.getFilename();
    }
}
