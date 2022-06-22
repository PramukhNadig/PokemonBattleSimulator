package Types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Type {


    HashMap<Types, ArrayList<Types>> strongAgainst;;
    public Type() {
        makeHalfEffectHashMap();
    }

    //create hashmap in which the key is the type and the value is an arraylist of the types that it is does half damage to
    private HashMap<Types, ArrayList<Types>> makeHalfEffectHashMap() {
        strongAgainst = new HashMap<Types, ArrayList<Types>>();
        strongAgainst.put(Types.NORMAL, new ArrayList<Types>(Arrays.asList(Types.ROCK, Types.STEEL)));
        strongAgainst.put(Types.FIRE, new ArrayList<Types>(Arrays.asList(Types.ROCK, Types.FIRE, Types.WATER, Types.DRAGON)));
        strongAgainst.put(Types.WATER, new ArrayList<Types>(Arrays.asList(Types.WATER, Types.GRASS, Types.DRAGON)));
        strongAgainst.put(Types.GRASS, new ArrayList<Types>(Arrays.asList(Types.GRASS, Types.GROUND, Types.ROCK, Types.STEEL, Types.FLYING, Types.BUG)));
        strongAgainst.put(Types.ELECTRIC, new ArrayList<Types>());
        strongAgainst.put(Types.ICE, new ArrayList<Types>());
        strongAgainst.put(Types.FIGHTING, new ArrayList<Types>());
        strongAgainst.put(Types.POISON, new ArrayList<Types>());
        strongAgainst.put(Types.GROUND, new ArrayList<Types>());
        strongAgainst.put(Types.FLYING, new ArrayList<Types>());
        strongAgainst.put(Types.PSYCHIC, new ArrayList<Types>());
        strongAgainst.put(Types.BUG, new ArrayList<Types>());
        strongAgainst.put(Types.ROCK, new ArrayList<Types>());
        strongAgainst.put(Types.GHOST, new ArrayList<Types>());
        strongAgainst.put(Types.DRAGON, new ArrayList<Types>());
        strongAgainst.put(Types.DARK, new ArrayList<Types>());
        strongAgainst.put(Types.STEEL, new ArrayList<Types>());
        strongAgainst.put(Types.FAIRY, new ArrayList<Types>());
        
        
        return strongAgainst;
    }
}