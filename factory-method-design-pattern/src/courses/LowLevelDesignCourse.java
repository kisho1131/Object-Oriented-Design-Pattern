package courses;

import modules.*;

public class LowLevelDesignCourse extends Courses{
  @Override
  public void createCourses() {
    modules.add(new IntroductionModule());
    modules.add(new ConceptModule());
    modules.add(new AssignmentModule());
    modules.add(new QuizModule());
    modules.add(new SummaryModule());
  }
}
