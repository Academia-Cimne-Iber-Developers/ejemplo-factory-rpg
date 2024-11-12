package armaduras;

public class ArmaduraFuego implements Armadura {
  @Override
  public void defender() {
      System.out.println("¡Defensa con armadura de fuego! Refleja daño ardiente");
  }

  @Override
  public String obtenerTipo() {
      return "Armadura de Fuego";
  }
}