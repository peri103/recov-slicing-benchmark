import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipConfig {
    private GzipParameters gzipParams = new GzipParameters();

    public void configureOperatingSystem(int osCode) {
        /* write */ gzipParams.setOperatingSystem(osCode);
    }

    public int getConfiguredOperatingSystem() {
        return gzipParams.getOperatingSystem();
    }
}