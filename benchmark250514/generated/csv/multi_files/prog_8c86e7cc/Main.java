public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        String csvData = "name,age\nJohn,30\n\nDoe,25";
        student.addRecord(csvData);
        boolean isConsistent = student.isRecordConsistent();
        System.out.println("Is the student's first record consistent? " + isConsistent);
    }
}