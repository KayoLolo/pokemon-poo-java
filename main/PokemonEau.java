import java.lang.annotation.Target;

public class PokemonEau extends PokemonAbstract  {


   public PokemonEau(String name, int pv, Statistiques stats){
      super(name, pv, stats);

      // Exemple d'attaque par défaut pour les Pokémon de type Eau
      this.currentStrategy = new AttackNormal("Pistolet à O", 40);
   }

}
