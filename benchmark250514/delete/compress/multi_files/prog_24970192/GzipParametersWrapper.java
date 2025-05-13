import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;

public class GzipParametersWrapper {
    private GzipParameters gzipParameters;

    public GzipParametersWrapper() {
        this.gzipParameters = new GzipParameters();
    }

    public void setModificationTime(Date modificationTime) {
        /* write */ gzipParameters.setModificationTime(modificationTime);
    }

    public Date getModificationTime() {
        return gzipParameters.getModificationTime();
    }
}
