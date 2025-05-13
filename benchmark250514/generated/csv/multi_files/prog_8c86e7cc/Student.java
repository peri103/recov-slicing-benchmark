public class Student {
    private String name;
    private int age;
    private StudentRecord record;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.record = new StudentRecord();
    }

    public void addRecord(String csvData) {
        record.parseCSV(csvData);
    }

    public boolean isRecordConsistent() {
        return record.isFirstRecordConsistent();
    }
}
