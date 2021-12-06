package human;

public class BritishBoy extends Human{

  private String region;

  public BritishBoy(int age, String name, String region) {
    super(age, name);
    this.region = region;
  }

  @Override
  public void speak() {
    System.out.println("I'm speaking English");
  }

  public void speak(String string) {
    System.out.println("I'm speaking English:" + string);
  }

}
