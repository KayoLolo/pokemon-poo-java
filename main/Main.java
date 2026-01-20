public class Main {
    
    public static void main(String[] args) {
        Equipe equipeRouge = new Equipe();
        PokemonFeu Felinferno = new PokemonFeu("Felinferno", 210, new Statistiques(50, 20, 20));
        
        
        System.out.println("Taille avant add : " + equipeRouge.getSizeTeam());
        equipeRouge.add(Felinferno);
        System.out.println("Taille après add : " + equipeRouge.getSizeTeam());
        System.out.println("Premier Pokemon : " + equipeRouge.getFirstPokemon());
        
        Equipe equipeBleue = new Equipe();
        PokemonEau Oratoria = new PokemonEau("Oratoria", 195, new Statistiques(41, 32, 23));
        
        
        System.out.println("Taille avant add : " + equipeBleue.getSizeTeam());
        equipeBleue.add(Oratoria);
        System.out.println("Taille après add : " + equipeBleue.getSizeTeam());
        System.out.println("Premier Pokemon : " + equipeBleue.getFirstPokemon());
        
        
        Combat combat = new Combat(equipeRouge, equipeBleue);
        combat.debutCombat();
    }
}