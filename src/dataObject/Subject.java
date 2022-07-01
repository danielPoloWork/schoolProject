package dataObject;

import enumObject.SubjectTypeEnum;

public class Subject {

  // DECLARATION
  private final String id;
  private final SubjectTypeEnum type;

  // CONSTRUCTOR
  public Subject(String idArg, SubjectTypeEnum typeArg) {
    this.id = idArg;
    this.type = typeArg;
  }

  // SELECT
  public String selectId() {
    return this.id;
  }

  public SubjectTypeEnum selectType() {
    return this.type;
  }
}
