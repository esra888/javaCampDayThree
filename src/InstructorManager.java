public class InstructorManager extends UserManager{

    @Override
    public void add(User user) {
        System.out.println("Teacher added");
    }

    public void givenCourses(Instructor instructor) {
        System.out.println(instructor.getName() + "'s lessons: " + instructor.getGivenCourses());
    }

}
