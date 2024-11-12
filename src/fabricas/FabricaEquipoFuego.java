package fabricas;
import armaduras.Armadura;
import armaduras.ArmaduraFuego;
import armas.Arma;

import armas.EspadaFuego;

public class FabricaEquipoFuego implements FabricaEquipamiento {
  @Override
  public Arma crearArma() {
      return new EspadaFuego();
  }

  @Override
  public Armadura crearArmadura() {
      return new ArmaduraFuego();
  }
}