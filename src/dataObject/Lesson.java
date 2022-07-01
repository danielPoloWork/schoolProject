package dataObject;

import enumObject.SubjectTypeEnum;
import java.util.List;

public class Lesson {

  // DECLARATION
  private final String id;
  private final String dateTimeEnd;
  private final String dateTimeStart;
  private final SubjectTypeEnum subject;
  private final List<String> students;
  private final String teacherId;

  // CONSTRUCTOR
  public Lesson(String idArg, String dateTimeEndArg, String dateTimeStartArg, SubjectTypeEnum subjectArg,
      List<String> studentsArg, String teacherIdArg) {
    this.id = idArg;
    this.dateTimeEnd = dateTimeEndArg;
    this.dateTimeStart = dateTimeStartArg;
    this.subject = subjectArg;
    this.students = studentsArg;
    this.teacherId = teacherIdArg;
  }

  // SELECT
  public String getDateTimeEnd() {
    return this.dateTimeEnd;
  }

  public String getDateTimeStart() {
    return this.dateTimeStart;
  }

  public String getId() {
    return this.id;
  }

  public List<String> getStudents() {
    return this.students;
  }

  public SubjectTypeEnum getSubject() {
    return this.subject;
  }

  public String getTeacherId() {
    return this.teacherId;
  }
}