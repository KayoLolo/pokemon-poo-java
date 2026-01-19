public abstract class PokemonAbstract {
    protected String name;
    protected int pv;
    protected Statistiques stats;
    //Dans une classe Abstraite on initialise comme les autres classes
    public PokemonAbstract(String name, int pv){
        
        this.name =name;
        this.pv =pv;
        this.stats = stats;
        
    }

    //Tous les Pokémon peuvent perdre des PV, la mécanique est la même → concret
    //Tous les Pokémon ont des attaques différentes (eau, feu, plante…) → abstrait


    public abstract void attack(PokemonAbstract target, int damage);

    public void takeDamage(int damage){
        pv -= damage;
        if(pv < 0){
            pv = 0;
        }
    }

    public PokemonAbstract getPokemon(PokemonAbstract a){
        return a;
    }

    public int getAttack(){
        return stats.getAttack();
    }

    public int getSpeed(){
        return stats.getSpeed();
    }

    public int getDefense(){
        return stats.getDefense();
    }


    public int getPv(){
        return pv;
    }

    @Override
    public String toString() {
        return name + " (" + pv + " PV)";
    }

    

    //  public static void main(String[] args) {
    //     Pokemon pikachu =new Pokemon("pikachu",160, 10);
    //     Pokemon salameche = new Pokemon("salameche", 150, 20);

    //     pikachu.attack(salameche);
    //     salameche.attack(pikachu);

    //     System.out.println(salameche);
    //     System.out.println(pikachu);
    // }


}