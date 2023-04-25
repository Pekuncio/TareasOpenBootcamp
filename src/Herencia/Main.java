package Herencia;

public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setEdad(25);
    cliente.setNombre("Paco");
    cliente.setTelefono(654987456);
    cliente.setCredito(3000);
    System.out.println("Cliente , Edad : " + cliente.getEdad()+ ", Nombre : " + cliente.getNombre() + ", telefono : "+ cliente.getTelefono() + ", Credito : " + cliente.getCredito());
    Trabajador trabajador = new Trabajador();
    trabajador.setEdad(40);
    trabajador.setNombre("Antonio");
    trabajador.setTelefono(56565656);
    trabajador.setSalario(2500.50);
    System.out.println("Trabajador , Edad : " + trabajador.getEdad()+ ", Nombre : " + trabajador.getNombre() + ", telefono : "+ trabajador.getTelefono() + ", Credito : " + trabajador.getSalario());

  }
}

class Persona{
  private int edad;
  private String nombre;
  private int telefono;

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }
}
class Cliente extends Persona{
  private int credito;

  public int getCredito() {
    return credito;
  }

  public void setCredito(int credito) {
    this.credito = credito;
  }
}
class Trabajador extends Persona{
  private double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}

