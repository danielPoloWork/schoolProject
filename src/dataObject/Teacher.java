package dataObject;

public class Teacher {

  // DECLARATION
  private final String id;
  private final String name;
  private final String surname;
  private final String birthDate;

  // CONSTRUCTOR
  public Teacher(String idArg, String nameArg, String surnameArg, String birthDateArg) {
    this.id = idArg;
    this.name = nameArg;
    this.surname = surnameArg;
    this.birthDate = birthDateArg;
  }

  // SELECT
  public String selectBirthDate() {
    return this.birthDate;
  }

  public String selectId() {
    return this.id;
  }

  public String selectName() {
    return this.name;
  }

  public String selectSurname() {
    return this.surname;
  }
}
