import human.BarberShop;
import human.BritishBoy;
import human.Human;
import human.UkrainianBoy;

public class Main {

  public static void main(String[] args) {

    Human boy = new UkrainianBoy(25, "Ivan");
    boy.speak();
    BritishBoy boy2 = new BritishBoy(25,"Jon","London");
    var shop = new BarberShop();
    shop.cut(boy);
    shop.cut(boy2);

    boy2.speak();
    boy2.speak("ascd");
  }
}
