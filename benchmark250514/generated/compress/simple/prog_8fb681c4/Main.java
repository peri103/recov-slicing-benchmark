import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setComment("This is a test comment.");
        /* read */ String comment = gzipParams.getComment();
        System.out.println(comment);
    }
}