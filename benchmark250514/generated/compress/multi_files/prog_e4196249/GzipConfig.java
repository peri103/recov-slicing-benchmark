import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipConfig {
    private GzipParameters gzipParameters;

    public GzipConfig() {
        this.gzipParameters = new GzipParameters();
    }

    public void configureOperatingSystem(int os) {
        /* write */ gzipParameters.setOperatingSystem(os);
    }

    public int getConfiguredOperatingSystem() {
        return gzipParameters.getOperatingSystem();
    }
}
