import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setUncompressedSize(long size) {
        /* write */ gzipParameters.setUncompressedSize(size);
    }

    public long getUncompressedSize() {
        return gzipParameters.getUncompressedSize();
    }
}
