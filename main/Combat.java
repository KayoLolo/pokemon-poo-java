public class Combat {

    private Equipe a;
    private Equipe b;
    
    //Le combat commence avec deux pokemons créés dans une équipe
        //On va donc créer deux pokemons equiépe de pokemon 
        

        public Combat(Equipe equipe1, Equipe equipe2){

            this.a = equipe1;
            this.b = equipe2;

      
        }

        
        public void debutCombat(){
            if (a.getFirstPokemon() == null || b.getFirstPokemon() == null) {
                System.out.println("Erreur : Une équipe n'a pas de Pokémon !");
            return;
        }


            PokemonAbstract pok1 = a.getFirstPokemon();
            PokemonAbstract pok2 = b.getFirstPokemon();

            while (pok1.getPv() > 0 && pok2.getPv() > 0) {
                pok1.attack(pok2);
                pok2.attack(pok1);
            }
            System.out.println("PV Équipe A : " + pok1.getPv());
            System.out.println("PV Équipe B : " + pok2.getPv());
            
            if (pok1.getPv() <= 0 ) {
                System.out.println("La victoire appartient à"+b);
            }else{
                System.out.println("La victoire appartient à"+a);
            }
        }



        

}
