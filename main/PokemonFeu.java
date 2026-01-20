import java.lang.annotation.Target;

public class PokemonFeu extends PokemonAbstract{

    public PokemonFeu(String name, int pv, Statistiques stats){
      super(name, pv, stats);
   }

   @Override
    public void attack(PokemonAbstract target){
        if (target.getPv() <= 0) {
        System.out.println(target.name + " est déjà KO !");
        return;
      }
        target.takeDamage(this);

        System.out.println(this.name + " attaque " + target.name + " !");
    }

    
}
