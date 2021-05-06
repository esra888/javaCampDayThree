public class Instructor extends User {
    private String givenCourses;

    public Instructor() {
    }

    public Instructor(int id, String name, String givenCourses) {
        super(id, name);
        this.givenCourses = givenCourses;
    }

    public String getGivenCourses() {
        return givenCourses;
    }

    public void setGivenCourses(String givenCourses) {
        this.givenCourses = givenCourses;
    }
}
