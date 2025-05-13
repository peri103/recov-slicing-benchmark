import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipHelper {
    private GzipParameters gzipParameters;

    public GzipHelper() {
        this.gzipParameters = new GzipParameters();
    }

    public void setExtraData(byte[] data) {
        /* write */ gzipParameters.setExtra(data);
    }

    public byte[] getExtraData() {
        return gzipParameters.getExtra();
    }
}
