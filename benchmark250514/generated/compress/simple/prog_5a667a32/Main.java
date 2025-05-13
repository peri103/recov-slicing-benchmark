import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        // Initialize the GzipParameters object
        GzipParameters gzipParameters = new GzipParameters();
        
        // Use the write method to set the filename
        /* write */ gzipParameters.setFilename("example.txt");
        
        // Use the read method to get the filename
        /* read */ String filename = gzipParameters.getFilename();
        
        // Print the filename to ensure it was read correctly
        System.out.println(filename);
    }
}