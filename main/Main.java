public class Main {
    
    public static void main(String[] args) {
        // Equipe equipeRouge = new Equipe();
        // PokemonFeu Felinferno = new PokemonFeu("Felinferno", 210, new Statistiques(50, 20, 20));
        
        
        // System.out.println("Taille avant add : " + equipeRouge.getSizeTeam());
        // equipeRouge.add(Felinferno);
        // System.out.println("Taille après add : " + equipeRouge.getSizeTeam());
        // System.out.println("Premier Pokemon : " + equipeRouge.getFirstPokemon());
        
        // Equipe equipeBleue = new Equipe();
        // PokemonEau Oratoria = new PokemonEau("Oratoria", 195, new Statistiques(41, 32, 23));
        
        
        // System.out.println("Taille avant add : " + equipeBleue.getSizeTeam());
        // equipeBleue.add(Oratoria);
        // System.out.println("Taille après add : " + equipeBleue.getSizeTeam());
        // System.out.println("Premier Pokemon : " + equipeBleue.getFirstPokemon());
        
        
        // Combat combat = new Combat(equipeRouge, equipeBleue);
        // combat.debutCombat();

        // Créer les Pokémon (avec attaques par défaut)
Statistiques stats1 = new Statistiques(50, 30, 20);
Statistiques stats2 = new Statistiques(40, 25, 15);
PokemonAbstract pikachu = new PokemonEau("Pikachu", 100, stats1);
PokemonAbstract salameche = new PokemonFeu("Salamèche", 80, stats2);

// Utiliser l'attaque par défaut
pikachu.attack(salameche);  // Utilise "Pistolet à O"

// Changer de stratégie
pikachu.setAttackStrategy(new AttackNormal("Hydrocanon", 60));
pikachu.attack(salameche);  // Utilise "Hydrocanon"
    }

    
}