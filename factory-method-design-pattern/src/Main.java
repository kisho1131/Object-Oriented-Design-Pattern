import courses.CourseFactory;
import courses.Courses;

public class Main {
  public static void main(String[] args) {
    Courses courseHLD = CourseFactory.getCourse("HLD");
    Courses coursesLLD = CourseFactory.getCourse("LLD");

    assert coursesLLD !=null;
    System.out.print("Low Level Course: ");
    System.out.println(coursesLLD.getCourses());

    assert courseHLD!=null;
    System.out.print("High Level Course: ");
    System.out.println(courseHLD.getCourses());
  }
}