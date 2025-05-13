import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setCRC32(long crc) {
        /* write */ gzipParameters.setCRC32(crc);
    }

    public long getCRC32() {
        return gzipParameters.getCRC32();
    }
}
