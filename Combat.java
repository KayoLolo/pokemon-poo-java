public class Combat {

    private Equipe a;
    private Equipe b;
    
    //Le combat commence avec deux pokemons créés de façon aléatoire 
        //On va donc créer deux pokemons equiépe de pokemon 
        

        public Combat( Equipe a, Equipe b){
            PokemonFeu Felinferno = new PokemonFeu("Felinferno", 210);

            PokemonEau Oratoria =new PokemonEau("Oratoria", 195);

            this.a =new Equipe();
            this.b = new Equipe();

            a.add(Felinferno);
            b.add(Oratoria);

      
        }

        
        public void debutCombat(){
            a.getFirstPokemon();
            b.getFirstPokemon();
            while (a.getFirstPokemon().getPv() != 0 | b.getFirstPokemon().getPv() != 0) {
                a.getFirstPokemon().attack(b.getFirstPokemon(), 40);
                b.getFirstPokemon().attack(a.getFirstPokemon(), 50);
            }
            System.out.println(a.getFirstPokemon().getPv());
            System.out.println(b.getFirstPokemon().getPv());
            
            if (a.getFirstPokemon().getPv() == 0 ) {
                System.out.println("La victoire appartient à"+b);
            }else{
                System.out.println("La victoire appartient à"+a);
            }
        }



        

}
