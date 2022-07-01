package dataObject;

public class Lesson {

  // DECLARATION
  private final String id;
  private final String dateTimeEnd;
  private final String dateTimeStart;
  private final String classId;
  private final String studentId;
  private final String teacherId;

  // CONSTRUCTOR
  public Lesson(String idArg, String dateTimeEndArg, String dateTimeStartArg, String classIdArg,
      String studentIdArg, String teacherIdArg) {
    this.id = idArg;
    this.dateTimeEnd = dateTimeEndArg;
    this.dateTimeStart = dateTimeStartArg;
    this.classId = classIdArg;
    this.studentId = studentIdArg;
    this.teacherId = teacherIdArg;
  }

  // SELECT
  public String selectClassId() {
    return this.classId;
  }

  public String selectDateTimeEnd() {
    return this.dateTimeEnd;
  }

  public String selectDateTimeStart() {
    return this.dateTimeStart;
  }

  public String selectId() {
    return this.id;
  }

  public String selectStudentId() {
    return this.studentId;
  }

  public String selectTeacherId() {
    return this.teacherId;
  }
}