package student;

public class Main {

  public static void main(String[] args) {
    Student student = new Student("Patrick");
    student.doHomework(DayOfWeek.SUNDAY);
    student.playComputer(DayOfWeek.TUESDAY);

    Student student1 = new Student("Patrick");

    System.out.println(student.hashCode());
    System.out.println(student1.hashCode());
  }


}
