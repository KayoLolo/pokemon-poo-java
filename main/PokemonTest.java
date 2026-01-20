import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PokemonTest {

    private PokemonAbstract pikachu;
    private PokemonAbstract salameche;

    @BeforeEach
    void setUp() {
        
        pikachu = new PokemonEau("pikachu", 160, new Statistiques(12, 9, 19));
        salameche = new PokemonFeu("salameche", 150, new Statistiques(19, 10, 12));
    }

    @Test
    void shouldAttackTarget() {
        pikachu.attack(salameche);
        assertEquals(140, salameche.getPv());
    }

    @Test
    void shouldTakeDamage(){
        salameche.takeDamage(20);
        assertEquals(130, salameche.getPv());
    }
}