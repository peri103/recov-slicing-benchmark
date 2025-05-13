import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipWrapper {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setExtraData(byte[] extraData) {
        /* write */ gzipParameters.setExtra(extraData);
    }

    public byte[] getExtraData() {
        return gzipParameters.getExtra();
    }
}
