public class Statistiques {
    
    int atk;
    int def;
    int spd;

    public Statistiques(int atk, int def, int spd){
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    public int getSpeed(){
        return spd;
    }

    public int getAttack(){
        return atk;
    }

    public int getDefense(){
        return def;
    }

}
