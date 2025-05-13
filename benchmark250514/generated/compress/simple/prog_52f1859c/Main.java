import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.txt");
        /* write */ zipEntry.setComment("This is a comment");
        /* read */ String comment = zipEntry.getComment();
        System.out.println(comment);
    }
}