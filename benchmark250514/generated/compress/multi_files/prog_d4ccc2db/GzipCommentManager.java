import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class GzipCommentManager {
    private GzipParameters gzipParams = new GzipParameters();

    public void setComment(String comment) {
        /* write */ gzipParams.setComment(comment);
    }

    public String getComment() {
        return gzipParams.getComment();
    }
}
