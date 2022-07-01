package dataObject;

import java.util.List;

public class StudentRelation extends Student{

  private List<Lesson> lessonList;
  private List<Grade> gradeList;

  public StudentRelation(Student studentArg) {
    super(studentArg.getId(),
        studentArg.getName(),
        studentArg.getSurname(),
        studentArg.getBirthDate());
  }

  // @Overload
  public StudentRelation(Student studentArg, List<Grade> gradesListArg, List<Lesson> lessonListArg) {
    this(studentArg);
    this.gradeList = gradesListArg;
    this.lessonList = lessonListArg;
  }

  // SELECT
  public List<Grade> getGradeList() {
    return this.gradeList;
  }

  public List<Lesson> getLessonList() {
    return this.lessonList;
  }

  // INSERT
  public void setGradeList(List<Grade> gradeListArg) {
    this.gradeList = gradeListArg;
  }

  public void setLessonList(List<Lesson> lessonListArg) {
    this.lessonList = lessonListArg;
  }
}