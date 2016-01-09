import java.time.LocalDate;

public class IdKaart {
  String isikukood;

  IdKaart(String isikukood) {
    this.isikukood = isikukood;
  }

  boolean onVahemalt12Aastane() {
    int praeguneAasta = LocalDate.now().getYear();
    return sunniaasta() <= praeguneAasta - 12;
  }

  int sunniaasta() { // 4. praktikumi 2. harjutus
    int algus = Integer.parseInt(isikukood.substring(0, 1));
    int aasta = Integer.parseInt(isikukood.substring(1, 3));
    if (algus <= 2)
      return 1800 + aasta;
    if (algus <= 4)
      return 1900 + aasta;
    if (algus <= 6)
      return 2000 + aasta;
    return 2100 + aasta;
  }
}