import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipParametersHandler {
    private GzipParameters gzipParams = new GzipParameters();

    public void setGzipComment(String comment) {
        /* write */ gzipParams.setComment(comment);
    }

    public String getGzipComment() {
        return gzipParams.getComment();
    }
}
