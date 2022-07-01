package repository;

import dataObject.Grade;
import dataObject.Lesson;
import dataObject.Student;
import dataObject.Teacher;
import dataObject.StudentRelation;
import dataObject.TeacherRelation;
import exception.SchoolRepositoryException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SchoolRepository {

  // DECLARATION
  private Map<String, Grade> gradeMap;
  private Map<String, Lesson> lessonMap;
  private Map<String, Student> studentMap;
  private Map<String, Teacher> teacherMap;

  // CONSTRUCTOR
  public SchoolRepository() {
    this.gradeMap = new HashMap<>();
    this.lessonMap = new HashMap<>();
    this.studentMap = new HashMap<>();
    this.teacherMap = new HashMap<>();
  }

  // SELECT
  public List<Grade> findGradeByStudentId(String studentIdArg) {
    List<Grade> gradesByStudentId = new ArrayList<>();
    for (Grade grade : this.gradeMap.values()) {
      if (grade.getStudentId().contains(studentIdArg)) {
        gradesByStudentId.add(grade);
      }
    }
    return gradesByStudentId;
  }

  private List<Grade> findGradeByTeacherId(String teacherIdArg) {
    List<Grade> gradesByTeacherId = new ArrayList<>();
    for (Grade grade : this.gradeMap.values()) {
      if (grade.getTeacherId().contains(teacherIdArg)) {
        gradesByTeacherId.add(grade);
      }
    }
    return gradesByTeacherId;
  }

  public List<Lesson> findLessonsByStudentId(String studentIdArg) {
    List<Lesson> lessonsByStudentId = new ArrayList<>();
    for (Lesson lesson : this.lessonMap.values()) {
      if (lesson.getStudents().contains(studentIdArg)) {
        lessonsByStudentId.add(lesson);
      }
    }
    return lessonsByStudentId;
  }

  public List<Lesson> findLessonsByTeacherId(String teacherIdArg) {
    List<Lesson> lessonsByTeacherId = new ArrayList<>();

    // METHOD 01
    for (Lesson lesson : this.lessonMap.values()) {
      if (lesson.getTeacherId().equals(teacherIdArg)) {
        lessonsByTeacherId.add(lesson);
      }
    }

    // METHOD 02 LAMBDA EXPRESSION without side effect
    /*lessonsByTeacherId = this.lessons.values()
        .stream()
        .filter(lessonAnonymous -> lessonAnonymous.getTeacherId().equals(teacherIdArg)).
        collect(Collectors.toList());*/

    // METHOD 03 LAMBDA EXPRESSION with side effect
    /*this.lessons.forEach((key, value) -> {
      if (value.getTeacherId()).equals(teacherIdArg)) {
        lessonsByTeacherId.add(value);
      }
    });*/

    return lessonsByTeacherId;
  }

  public Optional<StudentRelation> findStudentByStudentId(String studentId) {
    Optional<Student> studentOptional = Optional.ofNullable(this.studentMap.get(studentId));
    if (studentOptional.isPresent()) {
      List<Lesson> lessonsFound = findLessonsByStudentId(studentId);
      List<Grade> gradesFound = findGradeByStudentId(studentId);
      StudentRelation studentRelation = new StudentRelation(studentOptional.get(), gradesFound, lessonsFound);
      return Optional.of(studentRelation);
    } else {
      return Optional.empty();
    }
  }

  public Optional<TeacherRelation> findTeacherByTeacherId(String teacherId) {
    // Checking if is null or initialized
    Optional<Teacher> teacherOptional = Optional.ofNullable(this.teacherMap.get(teacherId));
    if (teacherOptional.isPresent()) {
      List<Lesson> lessonsFound = findLessonsByTeacherId(teacherId);
      List<Grade> gradesFound = findGradeByTeacherId(teacherId);
      TeacherRelation teacherRelation = new TeacherRelation(teacherOptional.get(), gradesFound, lessonsFound);
      return Optional.of(teacherRelation);
    } else {
      return Optional.empty();
    }
  }

  // INSERT
  public void setGrade(Grade gradeArg) throws SchoolRepositoryException {
    if (!gradeMap.containsKey(gradeArg.getId())) {
      gradeMap.put(gradeArg.getId(), gradeArg);
    } else {
      throw new SchoolRepositoryException("Lesson with ID_%s already exists!", gradeArg.getId());
    }
  }

  public void setLesson(Lesson lessonArg) throws SchoolRepositoryException {
    if (!lessonMap.containsKey(lessonArg.getId())) {
      lessonMap.put(lessonArg.getId(), lessonArg);
    } else {
      throw new SchoolRepositoryException("Lesson with ID_%s already exists!", lessonArg.getId());
    }
  }

  public void setStudent(Student studentArg) throws SchoolRepositoryException {
    if (!studentMap.containsKey(studentArg.getId())) {
      studentMap.put(studentArg.getId(), studentArg);
    } else {
      throw new SchoolRepositoryException("Lesson with ID_%s already exists!", studentArg.getId());
    }
  }

  public void setTeacher(Teacher teacherArg) throws SchoolRepositoryException {
    if (!teacherMap.containsKey(teacherArg.getId())) {
      teacherMap.put(teacherArg.getId(), teacherArg);
    } else {
      throw new SchoolRepositoryException("Teacher with ID_%s already exists!", teacherArg.getId());
    }
  }

}
