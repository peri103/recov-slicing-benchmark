import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class CRC32Handler {
    private GzipParameters gzipParameters;

    public CRC32Handler() {
        this.gzipParameters = new GzipParameters();
    }

    public void setCRC32Value(long value) {
        /* write */ gzipParameters.setCRC32(value);
    }

    public long getCRC32Value() {
        return gzipParameters.getCRC32();
    }
}
