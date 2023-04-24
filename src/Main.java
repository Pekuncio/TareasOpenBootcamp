

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int resultado = suma(2, 5 , 7);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche{
    public int puertas =4;

    public void incrementarPuertas(){
        puertas++;
    }
}