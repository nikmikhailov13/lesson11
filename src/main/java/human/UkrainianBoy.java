package human;

import human.Human;

public class UkrainianBoy extends Human {

  public UkrainianBoy(int age, String name) {
    super(age, name);
  }

  @Override
  public void speak() {
    System.out.println("i'm speaking ukrainian");
  }
}
