//généralement on met des interfaces mais ici on a besoin d'un constructeur donc on utilise une classe abstraite
//Apres avoir créé une strategy on pcrée une classe normale pour les différents types de start (AttatckNormal est un type de attackStategy)

public abstract class AttackStrategy {

    String attackName;
    int attackPower;

    public AttackStrategy(String attackName, int attackPower){
        this.attackName = attackName;
        this.attackPower = attackPower;

    }

    public String getAttackName(){
        return attackName;
    }

    public int getAttackPower(Statistiques power){
        attackPower = power.getAttack();
        return attackPower;
    }



    public abstract int calculateDamage(PokemonAbstract striker, PokemonAbstract target);



}
