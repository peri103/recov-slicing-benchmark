import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParams = new GzipParameters();

    public void setCrc32Value(long crc32) {
        /* write */ gzipParams.setCRC32(crc32);
    }

    public long getCrc32Value() {
        return gzipParams.getCRC32();
    }
}
