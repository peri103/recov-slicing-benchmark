import org.apache.commons.compress.compressors.gzip.GzipParameters;
import java.util.Date;

public class GzipManager {
    private GzipParameters gzipParameters;

    public GzipManager() {
        this.gzipParameters = new GzipParameters();
    }

    public void setModificationTime(Date date) {
        /* write */ gzipParameters.setModificationTime(date);
    }

    public Date getModificationTime() {
        return gzipParameters.getModificationTime();
    }
}
