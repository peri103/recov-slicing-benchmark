import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipConfig {
    private GzipParameters gzipParameters = new GzipParameters();
    
    public void setISize(int size) {
        /* write */ gzipParameters.setISize(size);
    }
    
    public int getISize() {
        return gzipParameters.getISize();
    }
}
