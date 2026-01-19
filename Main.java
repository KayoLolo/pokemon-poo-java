public class Main {
    
    public static void main(String[] args) {
        // PokemonEau mousstillon = new PokemonEau("Mousstillon", 100);
        // PokemonFeu grikui = new PokemonFeu("Grikui", 80);

        // mousstillon.attack(grikui,15);
        // System.out.println(grikui); // Grikui (65 PV)
        // System.out.println(mousstillon); // Mousstillon (100 PV)

        // Equipe mine = new Equipe();
        // PokemonFeu mousstillon = new PokemonFeu("Mousstillon", 60);
        // PokemonEau staros = new PokemonEau("Staros", 120);

        // mine.add(mousstillon);
        // mine.add(staros);
        // mine.getTeam();
        // // mine.remove(mousstillon);

        // System.out.println(mine.getTeam());
        // System.out.println(mine.getSizeTeam());
        // System.out.println(mine.getFirstPokemon());
        Equipe a = new Equipe();
        Equipe b = new Equipe();

        Combat combat = new Combat(a, b);
        PokemonFeu Felinferno = new PokemonFeu("Felinferno", 210);
        PokemonEau Oratoria =new PokemonEau("Oratoria", 195);
        a.add(Felinferno);
        b.add(Oratoria);
        combat.debutCombat();
    
    }
}
