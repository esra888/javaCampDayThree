public class Student extends User {
    private String takenCourse;

    public Student() {
    }

    public Student(int id, String name, String takenCourse) {
        super(id, name);
        this.takenCourse = takenCourse;
    }

    public String getTakenCourse() {
        return takenCourse;
    }

    public void setTakenCourse(String takenCourse) {
        this.takenCourse = takenCourse;
    }
}
