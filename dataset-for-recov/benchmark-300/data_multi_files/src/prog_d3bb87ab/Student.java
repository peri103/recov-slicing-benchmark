public class Student {
    private String name;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name) {
        this.name = name;
    }

    public void storeGrade(String course, int grade) {
        dataStorage.storeData(course, grade);
    }

    public Integer getGrade(String course) {
        return dataStorage.retrieveData(course);
    }
}
