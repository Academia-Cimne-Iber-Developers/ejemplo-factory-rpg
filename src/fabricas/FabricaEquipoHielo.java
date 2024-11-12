package fabricas;
import armaduras.Armadura;
import armaduras.ArmaduraHielo;
import armas.Arma;

import armas.EspadaHielo;

public class FabricaEquipoHielo implements FabricaEquipamiento {
  @Override
  public Arma crearArma() {
      return new EspadaHielo();
  }

  @Override
  public Armadura crearArmadura() {
      return new ArmaduraHielo();
  }
}