import armaduras.Armadura;
import armas.Arma;
import fabricas.FabricaEquipamiento;
import fabricas.FabricaEquipoFuego;
import fabricas.FabricaEquipoHielo;
import talleres.TallerArmas;
import talleres.TallerFuego;
import talleres.TallerHielo;

public class App {
    public static void main(String[] args) {
        // Usando Factory Method
        
        System.out.println("=== Creando armas individuales ===");
        TallerArmas tallerFuego = new TallerFuego();
        TallerArmas tallerHielo = new TallerHielo();
        
        tallerFuego.probarArma();
        tallerHielo.probarArma();
        
        // Usando Abstract Factory
        
        System.out.println("\n=== Creando sets completos de equipamiento ===");
        FabricaEquipamiento fabricaFuego = new FabricaEquipoFuego();
        FabricaEquipamiento fabricaHielo = new FabricaEquipoHielo();
  
        // Creando set de fuego
        Arma armaFuego = fabricaFuego.crearArma();
        Armadura armaduraFuego = fabricaFuego.crearArmadura();
        System.out.println("Set de Fuego creado:");
        armaFuego.atacar();
        armaduraFuego.defender();
  
        // Creando set de hielo
        Arma armaHielo = fabricaHielo.crearArma();
        Armadura armaduraHielo = fabricaHielo.crearArmadura();
        System.out.println("\nSet de Hielo creado:");
        armaHielo.atacar();
        armaduraHielo.defender();
    }
  }