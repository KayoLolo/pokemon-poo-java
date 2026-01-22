public class AttackNormal extends AttackStrategy{

    public AttackNormal(String attackName, int attackPower){
        super(attackName, attackPower);
    }

    @Override
    public int calculateDamage(PokemonAbstract striker, PokemonAbstract target){
        int damage = striker.getAttack() - target.getDefense();
        if (damage < 1) {
            damage = 1;
        }
        return damage;
    }
     
}
