package courses;

import courses.Courses;
import courses.HighLevelDesignCourse;
import courses.LowLevelDesignCourse;

public class CourseFactory {
  public static Courses getCourse(String courseType){
    switch (courseType){
      case "HLD":
        return new HighLevelDesignCourse();
      case "LLD":
        return new LowLevelDesignCourse();
      default:
        return null;
    }
  }
}
