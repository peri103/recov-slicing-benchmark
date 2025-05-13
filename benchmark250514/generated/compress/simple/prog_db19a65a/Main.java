import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry zipEntry = new ZipArchiveEntry("example.zip");
        /* write */ zipEntry.setComment("This is a zip file comment");
        /* read */ String comment = zipEntry.getComment();
        System.out.println(comment);
    }
}