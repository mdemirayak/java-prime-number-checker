import java.util.ArrayList;

class PrimeDirective {

  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();

    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    // Alle Zahlen durchgehen
    for (int i = 0; i < numbers.length; i++) {

      if (pd.isPrime(numbers[i])) {
        System.out.println(numbers[i] + " ist eine Primzahl");
      } else {
        System.out.println(numbers[i] + " ist KEINE Primzahl");
      }

    }

  }

  // Methode zum Prüfen
  public boolean isPrime(int number) {

    if (number < 2) {
      return false;
    }

    for (int zähler = 2; zähler < number; zähler++) {

      if (number % zähler == 0) {
        return false;
      }

    }

    return true;
  }

}

