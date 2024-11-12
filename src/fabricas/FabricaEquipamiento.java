package fabricas;
import armaduras.Armadura;
import armas.Arma;

public interface FabricaEquipamiento {
  Arma crearArma();
  Armadura crearArmadura();
}