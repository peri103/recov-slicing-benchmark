import org.apache.commons.compress.compressors.gzip.GzipParameters;

public class Main {
    public static void main(String[] args) {
        GzipParameters gzipParams = new GzipParameters();
        /* write */ gzipParams.setFilename("example.txt");
        /* read */ String filename = gzipParams.getFilename();
        System.out.println(filename);
    }
}