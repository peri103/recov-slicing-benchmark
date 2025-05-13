import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class CompressionSettings {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setCompressionLevel(int level) {
        /* write */ gzipParameters.setCompressionLevel(level);
    }

    public int getCompressionLevel() {
        return gzipParameters.getCompressionLevel();
    }
}
