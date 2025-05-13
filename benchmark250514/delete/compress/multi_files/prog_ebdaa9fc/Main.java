public class Main {
    public static void main(String[] args) {
        ArchiveManager archiveManager = new ArchiveManager();
        DumpArchiveEntryWrapper entryWrapper = new DumpArchiveEntryWrapper();
        
        entryWrapper.setCrcValue(12345L);
        archiveManager.addEntry(entryWrapper);

        Course course = new Course("Computer Science");
        Student student = new Student("Alice", 1);
        course.addStudent(student);

        DumpArchiveEntryWrapper retrievedEntry = archiveManager.getEntry(0);
        /* read */ long crcValue = retrievedEntry.getCrcValue();
        System.out.println("CRC Value: " + crcValue);

        for (Student s : course.getStudents()) {
            System.out.println("Student Name: " + s.getName() + ", ID: " + s.getId());
        }
    }
}