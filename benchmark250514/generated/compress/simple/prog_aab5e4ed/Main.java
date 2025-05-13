import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParameters = new GzipParameters();
        
        /* write */ 
        gzipParameters.setComment("This is a test comment.");
        
        /* read */ 
        String comment = gzipParameters.getComment();
        
        System.out.println(comment);
    }
}