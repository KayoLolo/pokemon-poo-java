public abstract class PokemonAbstract {
    protected String name;
    protected int pv;
    protected Statistiques stats;

    //en mettant strategy en protected on doit avoir un setter pour le modifier
    protected AttackStrategy currentStrategy;

    //Dans une classe Abstraite on initialise comme les autres classes
    public PokemonAbstract(String name, int pv, Statistiques stats){
        
        this.name =name;
        this.pv =pv;
        this.stats = stats;       
    }
    
    //Tous les Pokémon peuvent perdre des PV, la mécanique est la même → concret
    //Tous les Pokémon ont des attaques différentes (eau, feu, plante…) → abstrait

    //Si jamaais je le mettait en parametre ici pas besoin de setter pour la strategy 
        //Mais vu qu'il n'est pas en parametre on doit le setter


    public void setAttackStrategy(AttackStrategy strategy) {
        this.currentStrategy = strategy;
    }    


    public  void attack(PokemonAbstract target){
        if (currentStrategy == null) {
        System.out.println(this.name + " n'a pas d'attaque !");
        return;
        }

        if (target.getPv() <= 0) {
        System.out.println(target.name + " est déjà KO !");
        return;
        }
        int damage =currentStrategy.calculateDamage(this, target);
        target.takeDamage(damage);
        System.out.println(this.name + " utilise " + currentStrategy.getAttackName() + " !");
    }

    public void takeDamage(int damage){
        if (damage < 1) {
        damage = 1;
        }
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