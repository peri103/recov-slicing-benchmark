import org.apache.commons.compress.archivers.ar.ArArchiveEntry;

public class Main {
    public static void main(String[] args) {
        ArArchiveEntry entry = new ArArchiveEntry("example", 1000);
        byte[] extraData = new byte[]{1, 2, 3, 4, 5};
        
        /* write */ entry.setExtra(extraData);
        /* read */ byte[] readExtraData = entry.getExtra();
        
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}