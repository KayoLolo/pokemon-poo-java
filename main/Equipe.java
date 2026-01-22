import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Equipe {

    protected ArrayList<PokemonAbstract> equipePokemon;

    public Equipe(){
        this.equipePokemon = new ArrayList<>();
    }
    
    //une equipe permet de remove un pokemmon et d"en ajouter un 

    public void add(PokemonAbstract target){
        if (target == null) {
             throw new IllegalArgumentException("A target need to be selected"); 
        }
        equipePokemon.add(target);
    }

    
    public void remove(PokemonAbstract target){
        if (target == null) {
            throw new IllegalArgumentException("A target need to be selected");
        }
        equipePokemon.remove(target);
    }

    // public void choosePokemonRandomInTeam(PokemonAbstract target){
    //     Equipe equipePokemon = new Equipe();
    //     Random random = new Random();
    //     for(int i =0; i < equipePokemon.getSizeTeam(); i++){
            
    //         PokemonAbstract a = equipePokemon.getPokemon(random.nextInt(equipePokemon.getSizeTeam()));
            
    //     }
    // }
 


    public int getSizeTeam(){
        return equipePokemon.size();
    }

    public ArrayList<PokemonAbstract> getTeam(){
        return equipePokemon;
    }

    public PokemonAbstract getFirstPokemon(){
        if (equipePokemon.isEmpty()) {
            return null;
        }
        return equipePokemon.get(0);
    }

    
}
