public interface Attaquable{
    //La logique reste la meme, un pokemon prend des dégats et/ou attaque 
    //Tous les pokemons sont attaquebles
    //un pokemon a une attaque, il est une entité attquable
    //Que ce soit héritage abstract ou interface, toujours se demander""est un ?" ou "A un"

    //étant donné qu'un pokemon est a une entité attaquable on la note dans les interfaces
    
    public void takeDamage(PokemonAbstract target);
    
}