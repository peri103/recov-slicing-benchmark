import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersWrapper {
    private GzipParameters gzipParams = new GzipParameters();

    public void setOperatingSystem(int osCode) {
        /* write */ gzipParams.setOperatingSystem(osCode);
    }

    public int getOperatingSystem() {
        return gzipParams.getOperatingSystem();
    }
}
