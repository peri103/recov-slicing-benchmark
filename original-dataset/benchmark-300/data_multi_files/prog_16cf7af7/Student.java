public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeGrade(String subject, int grade) {
        dataStorage.storeData(subject, grade);
    }

    public Integer getGrade(String subject) {
        return dataStorage.retrieveData(subject);
    }
}
