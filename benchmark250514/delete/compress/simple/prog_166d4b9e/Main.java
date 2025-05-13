import org.apache.commons.compress.archivers.dump.DumpArchiveEntry;

public class Main {
    public static void main(String[] args) {
        DumpArchiveEntry entry = new DumpArchiveEntry();
        byte[] extraData = {1, 2, 3, 4, 5};
        
        /* write */ entry.setExtra(extraData);
        /* read */ byte[] readExtraData = entry.getExtra();
        
        for (byte b : readExtraData) {
            System.out.print(b + " ");
        }
    }
}