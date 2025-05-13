public class Main {
    public static void main(String[] args) {
        ArchiveManager manager = new ArchiveManager();
        ArchiveSummary summary = new ArchiveSummary();

        // Set summary details
        summary.setSummaryDetails(5000, 3);
        System.out.println("Total Size: " + summary.getTotalSize());
        System.out.println("Volume ID: " + summary.getVolumeId());

        // Set entry details
        manager.setEntryDetails("Example Entry", 500, 1024);
        System.out.println("Entry Name: " + manager.getEntryName());
        System.out.println("User ID: " + manager.getUserId());
        System.out.println("File Size: " + manager.getFileSize());

        // Set group ID
        manager.setGroupId(1001);

        // Perform unrelated operations
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + result);

        // Read group ID
        /* read */ long groupId = manager.getGroupId();
        System.out.println("Group ID: " + groupId);
    }
}