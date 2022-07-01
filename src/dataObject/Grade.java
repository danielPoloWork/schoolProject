package dataObject;

import enumObject.GradeValueEnum;
import enumObject.SubjectTypeEnum;

public class Grade {

  // DECLARATION
  private final String id;
  private final GradeValueEnum value;
  private final SubjectTypeEnum subject;
  private final String studentId;
  private final String teacherId;
  private final String dateTimeCreation;

  private String dateTimeUpdate;

  // CONSTRUCTOR
  public Grade(String idArg, GradeValueEnum valueArg, SubjectTypeEnum subjectArg, String dateTimeCreationArg, String dateTimeUpdateArg, String studentIdArg, String teacherIdArg) {
    this.dateTimeCreation = dateTimeCreationArg;
    this.dateTimeUpdate = dateTimeUpdateArg;
    this.id = idArg;
    this.studentId = studentIdArg;
    this.subject = subjectArg;
    this.teacherId = teacherIdArg;
    this.value = valueArg;
  }

  // SELECT
  public String getDateTimeCreation() {
    return this.dateTimeCreation;
  }

  public String getDateTimeUpdate() {
    return this.dateTimeUpdate;
  }

  public String getId() {
    return this.id;
  }

  public String getStudentId() {
    return this.studentId;
  }

  public SubjectTypeEnum getSubject() {
    return this.subject;
  }

  public String getTeacherId() {
    return this.teacherId;
  }

  public GradeValueEnum getValue() {
    return this.value;
  }

  // INSERT
  public void setDateTimeUpdate(String dateTimeUpdateArg) {
    this.dateTimeUpdate = dateTimeUpdateArg;
  }
}
