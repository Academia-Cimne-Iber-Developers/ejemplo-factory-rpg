package armas;

public class EspadaHielo implements Arma {
  @Override
  public void atacar() {
      System.out.println("¡Ataque con espada de hielo! Causa daño congelante");
  }

  @Override
  public String obtenerTipo() {
      return "Espada de Hielo";
  }
}