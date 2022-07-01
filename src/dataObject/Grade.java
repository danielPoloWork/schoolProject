package dataObject;

import enumObject.GradeValueEnum;

public class Grade {

  // DECLARATION
  private final String id;
  private final GradeValueEnum value;
  private final String studentId;
  private final String teacherId;

  private String dateTime;
  private boolean isUpdated = false;

  // CONSTRUCTOR
  public Grade(String idArg, GradeValueEnum valueArg, String dateTimeArg, String studentIdArg, String teacherIdArg) {
    this.dateTime = dateTimeArg;
    this.id = idArg;
    this.studentId = studentIdArg;
    this.teacherId = teacherIdArg;
    this.value = valueArg;
  }

  // SELECT
  public String selectDateTime() {
    return this.dateTime;
  }

  public String selectId() {
    return this.id;
  }

  public boolean selectIsUpdated() {
    return this.isUpdated;
  }

  public String selectStudentId() {
    return this.studentId;
  }

  public String selectTeacherId() {
    return this.teacherId;
  }

  public GradeValueEnum selectValue() {
    return this.value;
  }

  // INSERT
  public void insertDateTime(String dateTimeArg) {
    this.dateTime = dateTimeArg;
  }

  public void insertUpdated(boolean isUpdatedArg) {
    this.isUpdated = isUpdatedArg;
  }
}
