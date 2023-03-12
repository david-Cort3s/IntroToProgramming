
public class topicExercises4 {

  public static void main(String[] args) throws Exception {
    
    conditionalPNC();
    loopWhileIncrease();
    loopDoWhileIncreaseOne();
    loopForIncrease();
    switchSeason();

  }

  public static void conditionalPNC() {

    int numeroIf = 23;
    // int numeroIf = -23; Output: numeroIf es negativo
    // int numeroIf = 0; Output: numeroIf es cero

    if (numeroIf > 0) {
      System.out.println("numeroIf es positivo");
    } else if (numeroIf < 0) {
      System.out.println("numeroIf es negativo");
    } else {
      System.out.println("numeroIf es cero");
    }

  }

  public static void loopWhileIncrease() {

    int numeroWhile = 0;

    while (numeroWhile < 3) {
      numeroWhile++;
      System.out.println("While");
      System.out.println(numeroWhile);
    }

  }

  public static void loopDoWhileIncreaseOne() {

    int numeroWhile = 0;

    do {
      System.out.println("Do While");
      System.out.println(numeroWhile);
      numeroWhile++;
    } while (numeroWhile < 1);

  }

  public static void loopForIncrease() {

    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
      System.out.println("For: " + numeroFor);
    }

  }

  public static void switchSeason() {

    String currentSeason = "hola";

    switch (currentSeason) {

      case "Spring":
        System.out.println("Season is: " + currentSeason);
      break;

      case "Summer":
        System.out.println("Season is: " + currentSeason);
      break;

      case "Autumn":
        System.out.println("Season is: " + currentSeason);
      break;

      case "Winter":
        System.out.println("Season is: " + currentSeason);
      break;
    
      default:
        System.out.println(currentSeason + " no es una estacion del anio");
      break;

    }

  }

}