package armaduras;

public class ArmaduraHielo implements Armadura {
  @Override
  public void defender() {
      System.out.println("¡Defensa con armadura de hielo! Refleja daño congelante");
  }

  @Override
  public String obtenerTipo() {
      return "Armadura de Hielo";
  }
}