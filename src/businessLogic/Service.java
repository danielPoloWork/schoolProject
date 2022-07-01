package businessLogic;

import dataObject.Grade;
import dataObject.Lesson;
import dataObject.Student;
import dataObject.Subject;
import dataObject.Teacher;
import java.util.List;

public class Service {

  // DECLARATION
  private final List<Grade> grades;
  private final List<Lesson> lessons;
  private final List<Student> students;
  private final List<Subject> subjects;
  private final List<Teacher> teachers;

  // CONSTRUCTOR
  public Service(List<Grade> gradesArg, List<Lesson> lessonsArg,
      List<Student> studentsArg, List<Subject> subjectsArg, List<Teacher> teachersArg) {
    this.grades = gradesArg;
    this.lessons = lessonsArg;
    this.students = studentsArg;
    this.subjects = subjectsArg;
    this.teachers = teachersArg;
  }
}
