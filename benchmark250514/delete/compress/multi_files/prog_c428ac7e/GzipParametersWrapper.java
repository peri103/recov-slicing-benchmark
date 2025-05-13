import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParameters;

    public GzipParametersWrapper() {
        this.gzipParameters = new GzipParameters();
    }

    public void setCompressedSize(long size) {
        /* write */ gzipParameters.setCompressedSize(size);
    }

    public long getCompressedSize() {
        return gzipParameters.getCompressedSize();
    }
}
