import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipManager {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setOperatingSystem(int osCode) {
        /* write */ gzipParameters.setOperatingSystem(osCode);
    }

    public int getOperatingSystem() {
        return gzipParameters.getOperatingSystem();
    }
}