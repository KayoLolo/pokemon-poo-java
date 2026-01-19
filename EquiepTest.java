import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquiepTest {

    private Equipe mine;

    @BeforeEach
    void setUp() {
        mine = new Equipe();
    }



    @Test
    void shouldCountSize(){
        assertEquals(0, mine.getSizeTeam());
    }


    

    @Test
    void shouldAddPokemonInTeam() {
        PokemonEau staros = new PokemonEau("Staros", 120);
        mine.add(staros);
        assertEquals(staros, mine.getFirstPokemon() );
    }

    @Test
    void shouldRemoveAPokmon(){
        PokemonEau staros = new PokemonEau("Staros", 120);
        mine.add(staros);
        mine.remove(staros);
        assertEquals(0, mine.getSizeTeam());
    }
}