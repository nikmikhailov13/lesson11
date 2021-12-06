package human;

public abstract class Human {

  private int age;
  private String name;

  public Human(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat() {
    System.out.println("I am eating");
  }

  public abstract void speak();
}
