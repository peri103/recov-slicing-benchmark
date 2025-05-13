import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipConfig {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setOperatingSystem(int os) {
        /* write */ gzipParameters.setOperatingSystem(os);
    }

    public int getOperatingSystem() {
        return gzipParameters.getOperatingSystem();
    }
}
