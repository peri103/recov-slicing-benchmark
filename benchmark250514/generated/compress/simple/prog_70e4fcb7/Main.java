import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        // Initialize GzipParameters object
        GzipParameters gzipParams = new GzipParameters();
        
        // Write a comment using setComment method
        /* write */ gzipParams.setComment("This is a test comment");
        
        // Read the comment using getComment method
        /* read */ String comment = gzipParams.getComment();
        
        // Print the read comment
        System.out.println(comment);
    }
}