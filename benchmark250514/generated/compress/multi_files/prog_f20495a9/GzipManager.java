import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipManager {
    private GzipParameters gzipParameters = new GzipParameters();

    public void setComment(String comment) {
        /* write */ gzipParameters.setComment(comment);
    }

    public String getComment() {
        return gzipParameters.getComment();
    }
}
