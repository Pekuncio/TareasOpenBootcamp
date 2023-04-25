public class Main {
  public static void main(String[] args) {
    var numeroif = -5;

    if(numeroif>0){
      System.out.println("El numero es positivo");
    }else if (numeroif<0){
      System.out.println("El numero es negativo");
    }else {
      System.out.println("El numero es 0");
    }

    var numeroWhile=0;

    while(numeroWhile<3){
      System.out.println(numeroWhile);
      numeroWhile++;
    }
    System.out.println("-----------------------------");
    do{
      System.out.println(numeroWhile);
      numeroWhile++;
    }while(numeroWhile>5);
    System.out.println("-----------------------------");

    for(int numeroFor=0;numeroFor<=3;numeroFor++){
      System.out.println(numeroFor);
    }

    var estacion ="Otoño";
    switch (estacion){
      case "Verano":
        System.out.println("Es verano");
        break;
      case "Invierno":
        System.out.println("Es invierno");
        break;
      case "Otoño":
        System.out.println("Es otoño");
        break;
      case "Primavera":
        System.out.println("Es primavera");
        break;
      default:
        System.out.println(estacion);
        break;
    }
  }

}
