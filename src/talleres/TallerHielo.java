package talleres;
import armas.Arma;
import armas.EspadaHielo;

public class TallerHielo extends TallerArmas {
  @Override
  Arma crearArma() {
      return new EspadaHielo();
  }
}