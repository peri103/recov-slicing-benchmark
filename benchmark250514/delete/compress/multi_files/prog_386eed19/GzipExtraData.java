import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipExtraData {
    private GzipParameters gzipParameters;

    public GzipExtraData() {
        gzipParameters = new GzipParameters();
    }

    public void setExtraData(byte[] extra) {
        /* write */ gzipParameters.setExtra(extra);
    }

    public byte[] getExtraData() {
        return gzipParameters.getExtra();
    }
}
