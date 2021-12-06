package student;

public enum DayOfWeek {

  SUNDAY("воскресенье"),
  MONDAY("понедельник"),
  TUESDAY("вторник"),
  WEDNESDAY("среда"),
  THURTHDAY("четверг"),
  FRIDAY("пятница"),
  SATURDAY("субота");

  private String title;

  DayOfWeek(String title) {
    this.title = title;
  }


}
