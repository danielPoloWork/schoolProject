package enumObject;

public enum SubjectTypeEnum {

  // DECLARATION
  ALGEBRA("Algebra"),
  ARCHITECTURE("Architecture"),
  ART("Art"),
  ART_HISTORY("Art history"),
  ASTRONOMY("Astronomy"),
  BIOLOGY("Biology"),
  BUSINESS_STUDIES("Business studies"),
  CHEMISTRY("Chemistry"),
  CLASSICS("Classic"),
  COMPUTER_SCIENCE("Computer science"),
  DRAMA("Drama"),
  ECONOMY("Economy"),
  ENGINEERING("Engineering"),
  ENGLISH("English"),
  FRENCH("French"),
  GEOGRAPHY("Geography"),
  GEOMETRY("Geometry"),
  GERMAN("German"),
  GREEK("Greek"),
  HISTORY("History"),
  INFORMATION_TECHNOLOGY("Information technology"),
  ITALIAN("Italian"),
  LATIN("Latin"),
  LAW("Law"),
  LITERATURE("Literature"),
  MATHEMATICS("Mathematics"),
  MEDIA_STUDIES("Media studies"),
  MEDICINE("Medicine"),
  MUSIC("Music"),
  PSYCHOLOGY("Psychology"),
  PHILOSOPHY("Philosophy"),
  PHYSICAL_EDUCATION("Physical education"),
  PHYSICS("Physics"),
  POLITICS("Politics"),
  RELIGION("Religion"),
  SCIENCES("Sciences"),
  SEX_EDUCATION("Sex education"),
  SOCIAL_STUDIES("Social studies"),
  SOCIOLOGY("Sociology"),
  SPANISH("Spanish");

  private String label;

  // CONSTRUCTOR
  SubjectTypeEnum(String labelArg) {
    this.label = labelArg;
  }

  // SELECT
  public String selectLabel() {
    return this.label;
  }

  // INSERT
  public void insertLabel(String labelArg) {
    this.label = labelArg;
  }
}