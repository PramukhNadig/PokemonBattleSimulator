import java.util.HashMap;
import java.util.HashSet;

import Moves.Move;
import Pokemon.Pokemon;
import Types.Type;

public class Main {
    
    public static void main(String[] args) {
        init in = new init();
        HashSet<Move> moves = new HashSet<>(in.initMoves());
        System.out.println(moves.size());
        Pokemon pikachu    = new Pokemon("Pikachu", Type.ELECTRIC, Type.NONE, 5, 100, 55, 40, 90, 50, 90, moves);
        Pokemon bulbasaur  = new Pokemon("Bulbasaur", Type.GRASS, Type.NONE, 5, 100, 45, 45, 65, 35, 65, moves);
        Pokemon charmander = new Pokemon("Charmander", Type.FIRE, Type.NONE, 5, 100, 39, 52, 43, 60, 50, moves);
        Pokemon squirtle   = new Pokemon("Squirtle", Type.WATER, Type.NONE, 5, 100, 44, 48, 65, 43, 50, moves);
        Pokemon pidgey     = new Pokemon("Pidgey", Type.NORMAL, Type.FLYING, 5, 100, 45, 40, 45, 35, 35, moves);
        Pokemon rattata    = new Pokemon("Rattata", Type.NORMAL, Type.NONE, 5, 100, 30, 56, 35, 25, 35, moves);
        Pokemon geodude    = new Pokemon("Geodude", Type.ROCK, Type.GROUND, 5, 100, 40, 80, 100, 30, 30, moves);
        Pokemon graveler   = new Pokemon("Graveler", Type.ROCK, Type.GROUND, 5, 100, 55, 95, 115, 45, 45, moves);
        Pokemon golem      = new Pokemon("Golem", Type.ROCK, Type.GROUND, 5, 100, 80, 110, 130, 55, 55, moves);
        Pokemon ponyta     = new Pokemon("Ponyta", Type.FIRE, Type.NONE, 5, 100, 50, 85, 55, 65, 65, moves);
        Pokemon rapidash   = new Pokemon("Rapidash", Type.FIRE, Type.NONE, 5, 100, 65, 100, 70, 80, 80, moves);
        Pokemon abra       = new Pokemon("Abra", Type.PSYCHIC, Type.NONE, 5, 100, 25, 20, 15, 105, 90, moves);
        Pokemon kadabra    = new Pokemon("Kadabra", Type.PSYCHIC, Type.NONE, 5, 100, 40, 35, 30, 120, 105, moves);
        Pokemon alakazam   = new Pokemon("Alakazam", Type.PSYCHIC, Type.NONE, 5, 100, 55, 50, 45, 135, 120, moves);
        Pokemon machop     = new Pokemon("Machop", Type.FIGHTING, Type.NONE, 5, 100, 70, 80, 50, 35, 35, moves);
        Pokemon machoke    = new Pokemon("Machoke", Type.FIGHTING, Type.NONE, 5, 100, 80, 100, 70, 45, 45, moves);
        Pokemon machamp    = new Pokemon("Machamp", Type.FIGHTING, Type.NONE, 5, 100, 90, 130, 80, 55, 55, moves);
        Pokemon bellsprout = new Pokemon("Bellsprout", Type.GRASS, Type.POISON, 5, 100, 50, 75, 35, 70, 30, moves);
        Pokemon weepinbell = new Pokemon("Weepinbell", Type.GRASS, Type.POISON, 5, 100, 65, 90, 50, 85, 45, moves);
        Pokemon victreebel = new Pokemon("Victreebel", Type.GRASS, Type.POISON, 5, 100, 80, 105, 65, 100, 70, moves);
        Pokemon tentacool  = new Pokemon("Tentacool", Type.WATER, Type.POISON, 5, 100, 40, 40, 35, 100, 70, moves);
        Pokemon tentacruel = new Pokemon("Tentacruel", Type.WATER, Type.POISON, 5, 100, 80, 70, 65, 120, 100, moves);
        Pokemon articuno   = new Pokemon("Articuno", Type.ICE, Type.FLYING, 5, 100, 90, 85, 100, 95, 90, moves);
        Pokemon zapdos     = new Pokemon("Zapdos", Type.ELECTRIC, Type.FLYING, 5, 100, 90, 90, 85, 125, 90, moves);
        Pokemon moltres    = new Pokemon("Moltres", Type.FIRE, Type.FLYING, 5, 100, 90, 100, 90, 125, 90, moves);
        Pokemon dratini    = new Pokemon("Dratini", Type.DRAGON, Type.NONE, 5, 100, 41, 64, 45, 50, 50, moves);
        Pokemon dragonair  = new Pokemon("Dragonair", Type.DRAGON, Type.NONE, 5, 100, 61, 84, 65, 70, 70, moves);
        Pokemon dragonite  = new Pokemon("Dragonite", Type.DRAGON, Type.FLYING, 5, 100, 91, 134, 95, 100, 100, moves);
        Pokemon mewtwo     = new Pokemon("Mewtwo", Type.PSYCHIC, Type.NONE, 5, 100, 106, 110, 90, 154, 90, moves);
        Pokemon mew        = new Pokemon("Mew", Type.PSYCHIC, Type.NONE, 5, 100, 100, 100, 100, 100, 100, moves);
        Pokemon chikorita  = new Pokemon("Chikorita", Type.GRASS, Type.NONE, 5, 100, 45, 49, 65, 49, 65, moves);
        Pokemon bayleef    = new Pokemon("Bayleef", Type.GRASS, Type.NONE, 5, 100, 60, 62, 80, 63, 80, moves);
        Pokemon meganium   = new Pokemon("Meganium", Type.GRASS, Type.NONE, 5, 100, 80, 82, 100, 83, 100, moves);
        Pokemon cyndaquil  = new Pokemon("Cyndaquil", Type.FIRE, Type.NONE, 5, 100, 39, 52, 43, 60, 50, moves);
        Pokemon quilava    = new Pokemon("Quilava", Type.FIRE, Type.NONE, 5, 100, 58, 64, 58, 80, 65, moves);
        Pokemon typhlosion = new Pokemon("Typhlosion", Type.FIRE, Type.NONE, 5, 100, 78, 84, 78, 109, 85, moves);
        Pokemon totodile   = new Pokemon("Totodile", Type.WATER, Type.NONE, 5, 100, 50, 65, 64, 44, 48, moves);
        Pokemon croconaw   = new Pokemon("Croconaw", Type.WATER, Type.NONE, 5, 100, 65, 80, 80, 59, 63, moves);
        Pokemon feraligatr = new Pokemon("Feraligatr", Type.WATER, Type.NONE, 5, 100, 85, 105, 100, 79, 83, moves);
        Pokemon sentret    = new Pokemon("Sentret", Type.NORMAL, Type.NONE, 5, 100, 35, 46, 35, 65, 55, moves);
        Pokemon furret     = new Pokemon("Furret", Type.NORMAL, Type.NONE, 5, 100, 85, 76, 65, 112, 65, moves);
        Pokemon hoothoot   = new Pokemon("Hoothoot", Type.NORMAL, Type.FLYING, 5, 100, 60, 30, 30, 50, 65, moves);
        Pokemon noctowl    = new Pokemon("Noctowl", Type.NORMAL, Type.FLYING, 5, 100, 100, 50, 50, 80, 110, moves);
        Pokemon ledyba     = new Pokemon("Ledyba", Type.BUG, Type.FLYING, 5, 100, 40, 20, 30, 40, 55, moves);
        Pokemon ledian     = new Pokemon("Ledian", Type.BUG, Type.FLYING, 5, 100, 55, 35, 50, 55, 110, moves);
        Pokemon spinarak   = new Pokemon("Spinarak", Type.BUG, Type.POISON, 5, 100, 40, 60, 40, 40, 30, moves);
        Pokemon ariados    = new Pokemon("Ariados", Type.BUG, Type.POISON, 5, 100, 70, 90, 70, 60, 40, moves);
        Pokemon crobat     = new Pokemon("Crobat", Type.POISON, Type.FLYING, 5, 100, 85, 90, 80, 130, 85, moves);
        Pokemon chinchou   = new Pokemon("Chinchou", Type.ELECTRIC, Type.WATER, 5, 100, 75, 38, 38, 56, 67, moves);
        Pokemon lanturn    = new Pokemon("Lanturn", Type.ELECTRIC, Type.WATER, 5, 100, 125, 58, 58, 76, 67, moves);
        Pokemon pichu      = new Pokemon("Pichu", Type.ELECTRIC, Type.NONE, 5, 100, 20, 40, 15, 35, 60, moves);
        Pokemon cleffa     = new Pokemon("Cleffa", Type.FAIRY, Type.NONE, 5, 100, 50, 25, 28, 45, 55, moves);
        Pokemon igglybuff  = new Pokemon("Igglybuff", Type.FAIRY, Type.NONE, 5, 100, 90, 30, 15, 40, 15, moves);
        Pokemon togepi     = new Pokemon("Togepi", Type.FAIRY, Type.NONE, 5, 100, 35, 20, 65, 40, 65, moves);
        Pokemon togetic    = new Pokemon("Togetic", Type.FAIRY, Type.FLYING, 5, 100, 55, 40, 85, 80, 105, moves);
        Pokemon natu       = new Pokemon("Natu", Type.PSYCHIC, Type.FLYING, 5, 100, 40, 50, 90, 50, 95, moves);
        Pokemon xatu       = new Pokemon("Xatu", Type.PSYCHIC, Type.FLYING, 5, 100, 65, 75, 95, 70, 85, moves);
        Pokemon mareep     = new Pokemon("Mareep", Type.ELECTRIC, Type.NONE, 5, 100, 55, 40, 40, 65, 45, moves);
        Pokemon dugtrio    = new Pokemon("Dugtrio", Type.GROUND, Type.NONE, 5, 100, 35, 80, 50, 50, 120, moves);
        Pokemon[] pokemon  = {mareep, xatu, natu, togetic, togepi, igglybuff, cleffa, pichu, lanturn,
                noctowl, hoothoot, furret, sentret, mew, mewtwo, dragonite, dragonair, dragonair, dratini, moltres, zapdos, 
                articuno, moltres, mewtwo, mew, chikorita, bayleef, meganium, cyndaquil, quilava, typhlosion, totodile, croconaw,
                feraligatr, sentret, furret, hoothoot, noctowl, ledyba, ledian, spinarak, ariados, crobat, chinchou, lanturn, dugtrio
            };
        HashMap<Pokemon, Integer> pokemonMap = new HashMap<Pokemon, Integer>();
        for (Pokemon p : pokemon) {
            pokemonMap.put(p, 0);
        }

        for(int i = 0; i < pokemon.length; i++){
            for(int j = 0; j < pokemon.length; j++){
                if(i != j){
                    Pokemon p = pokemon[i].battle(pokemon[j]);
                    if(p == null){
                        continue;
                    }
                        pokemonMap.put(p, pokemonMap.get(p) + 1);
                    
                }
            }
        }
        int sum = 0;
        for(Pokemon p : pokemonMap.keySet()){
            System.out.println(p.getName() + ": " + pokemonMap.get(p));
            sum += pokemonMap.get(p);
        }
        System.out.println("Total: " + sum);
    }
        
}
    
