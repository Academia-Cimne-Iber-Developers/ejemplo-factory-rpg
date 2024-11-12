package armas;

public class EspadaFuego implements Arma {
  @Override
  public void atacar() {
      System.out.println("¡Ataque con espada de fuego! Causa daño ardiente");
  }

  @Override
  public String obtenerTipo() {
      return "Espada de Fuego";
  }
}