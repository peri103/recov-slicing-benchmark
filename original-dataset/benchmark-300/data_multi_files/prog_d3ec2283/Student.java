public class Student {
    private String name;
    private int age;
    private DataStorage dataStorage = new DataStorage();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void storeGrade(String subject, int grade) {
        dataStorage.storeData(subject, grade);
    }

    public Integer getGrade(String subject) {
        return dataStorage.retrieveData(subject);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
