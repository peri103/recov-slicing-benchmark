import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters parameters = new GzipParameters();
        /* write */ parameters.setComment("This is a test comment");
        /* read */ String comment = parameters.getComment();
        System.out.println(comment);
    }
}