import java.lang.annotation.Target;

public class PokemonEau extends PokemonAbstract {

   public PokemonEau(String name, int pv){
      super(name, pv);
   }


   @Override
   public void attack(PokemonAbstract target, int damage){
      if (target.pv < 0) {
         this.pv = 0;
      }
      target.takeDamage(damage);
    }

}
