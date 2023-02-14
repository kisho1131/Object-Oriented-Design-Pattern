package courses;

import modules.Modules;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

public abstract class Courses {
  protected List<Modules> modules = new ArrayList<>();
  public Courses(){
    this.createCourses();
  }
  public List<Modules> getCourses(){
    return this.modules;
  }
  public abstract void createCourses();
}
