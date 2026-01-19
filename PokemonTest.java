import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonTest {

    private Pokemon pikachu;
    private Pokemon salameche;

    @BeforeEach
    void setUp() {
        pikachu = new Pokemon("pikachu", 160, 10);
        salameche = new Pokemon("salameche", 150, 20);
    }



    @Test
    void shouldCreatePokemons(){
        pikachu = new Pokemon("pikachu", 160, 10);
        salameche = new Pokemon("salameche", 150, 20);
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
