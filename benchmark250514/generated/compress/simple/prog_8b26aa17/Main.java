import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ZipArchiveEntry entry = new ZipArchiveEntry("example.txt");
        /* write */ entry.setComment("This is a comment.");
        /* read */ String comment = entry.getComment();
        System.out.println(comment);
    }
}