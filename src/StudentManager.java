public class StudentManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println("Student added");
    }

    public void takenCourses(Student student) {
        System.out.println(student.getName() + "'s lessons: " + student.getTakenCourse());
    }
}
