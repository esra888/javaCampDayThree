public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "alex", "java");
        Instructor instructor = new Instructor(2, "jacob", "c#");
        User user = new User(3, "someone");

        UserManager userManager = new UserManager();
        userManager.add(user);
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.takenCourses(student);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.givenCourses(instructor);

    }
}
