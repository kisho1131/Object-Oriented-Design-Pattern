package courses;

import modules.ConceptModule;
import modules.IntroductionModule;
import modules.SummaryModule;

public class HighLevelDesignCourse extends Courses{
  @Override
  public void createCourses() {
    modules.add(new IntroductionModule());
    modules.add(new ConceptModule());
    modules.add(new SummaryModule());
  }
}
