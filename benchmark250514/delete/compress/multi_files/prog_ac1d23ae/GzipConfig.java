import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipConfig {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setHeaderCRC(boolean value) {
        /* write */ gzipParameters.setHeaderCRC(value);
    }

    public boolean getHeaderCRC() {
        return gzipParameters.getHeaderCRC();
    }
}