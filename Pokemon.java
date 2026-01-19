public class Pokemon {
    private String name;
    private int pv;
    private int damage;

    public Pokemon(String name, int pv, int damage){
        this.name = name;
        this.pv = pv;
        //étant donné qu'un pokemon prend des degats on rajoute un attribut damage
        this.damage = damage;
    }

    @Override
    public String toString() {
    return name + " (" + pv + " PV)";
    }

    

    //Premiere étape, réfléchir à ce qu'un pokemon peut faire
        //Il subit des dégats
        //Il attaque 


    public void attack(Pokemon target){
        if (target == null){
            throw new IllegalArgumentException("A target need to be selected");     
        }
        target.takeDamage(this.damage);

    }

    public void takeDamage(int damage){
        pv -= damage;
        if(pv < 0){
            pv = 0;
        }
    }


    public int getPv(){
        return pv;
    }

     public static void main(String[] args) {
        Pokemon pikachu =new Pokemon("pikachu",160, 10);
        Pokemon salameche = new Pokemon("salameche", 150, 20);

        pikachu.attack(salameche);
        salameche.attack(pikachu);

        System.out.println(salameche);
        System.out.println(pikachu);
    }


}