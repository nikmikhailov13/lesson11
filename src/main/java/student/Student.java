package student;

import java.util.Objects;

public class Student {

  private String name;
  private int age;
  private int salary;

  public Student(String name) {
    this.name = name;
  }


  public void doHomework(DayOfWeek dayOfWeek) {
    if (dayOfWeek == DayOfWeek.WEDNESDAY || dayOfWeek == DayOfWeek.SUNDAY) {
      System.out.println("Do Homework");
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Student)) {
      return false;
    }
    Student student = (Student) o;
    return age == student.age && salary == student.salary;
  }

  @Override
  public int hashCode() {
    return 31 * age * salary;
  }

  public void playComputer(DayOfWeek dayOfWeek) {
    switch (dayOfWeek) {
      case TUESDAY:
      case THURTHDAY:
        System.out.println("Play Computer");
        break;
      default:
        System.out.println("Do Homework");
    }


  }
}
