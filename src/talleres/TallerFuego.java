package talleres;
import armas.Arma;
import armas.EspadaFuego;

public class TallerFuego extends TallerArmas {
  @Override
  Arma crearArma() {
      return new EspadaFuego();
  }
}