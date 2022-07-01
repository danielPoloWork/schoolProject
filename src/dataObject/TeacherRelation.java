package dataObject;

import java.util.List;

public class TeacherRelation extends Teacher{

  private List<Grade> gradeList;
  private List<Lesson> lessonList;

  public TeacherRelation(Teacher teacherArg) {
    super(teacherArg.getId(),
        teacherArg.getName(),
        teacherArg.getSurname(),
        teacherArg.getBirthDate());
  }

  // @Overload
  public TeacherRelation(Teacher teacherArg, List<Grade> gradesListArg, List<Lesson> lessonListArg) {
    this(teacherArg);
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
