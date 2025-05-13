import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipConfig {
    private GzipParameters gzipParams;

    public GzipConfig() {
        gzipParams = new GzipParameters();
    }

    public void setOperatingSystem(int osCode) {
        /* write */ gzipParams.setOperatingSystem(osCode);
    }

    public int getOperatingSystem() {
        return gzipParams.getOperatingSystem();
    }
}
