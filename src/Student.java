public class Student {
    private String name = "Quỳnh";
    private String classes = "KT02";

    Student(){
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

     public void setName(String name) {
        this.name = name;
    }

     public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
