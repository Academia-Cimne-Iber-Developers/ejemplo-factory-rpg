package talleres;
import armas.Arma;

public abstract class TallerArmas {
    abstract Arma crearArma();
  
    public void probarArma() {
        Arma arma = crearArma();
        System.out.println("Probando " + arma.obtenerTipo());
        arma.atacar();
    }
  }