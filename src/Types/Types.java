package Types;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Types {


    HashMap<Type, HashSet<Type>> strongAgainst;;
    public Types() {
        makeHalfEffectHashMap();
    }

    //create hashmap in which the key is the type and the value is an HashSet of the types that it is does half damage to
    public HashMap<Type, HashSet<Type>> makeHalfEffectHashMap() {
        strongAgainst = new HashMap<Type, HashSet<Type>>();
        strongAgainst.put(Type.NORMAL, new HashSet<Type>(Arrays.asList(Type.ROCK, Type.STEEL)));
        strongAgainst.put(Type.FIRE, new HashSet<Type>(Arrays.asList(Type.ROCK, Type.FIRE, Type.WATER, Type.DRAGON)));
        strongAgainst.put(Type.WATER, new HashSet<Type>(Arrays.asList(Type.WATER, Type.GRASS, Type.DRAGON)));
        strongAgainst.put(Type.GRASS, new HashSet<Type>(Arrays.asList(Type.GRASS, Type.GRASS, Type.POISON, Type.FLYING, Type.BUG, Type.DRAGON, Type.STEEL)));
        strongAgainst.put(Type.ELECTRIC, new HashSet<Type>(Arrays.asList(Type.ELECTRIC, Type.GRASS, Type.DRAGON)));
        strongAgainst.put(Type.ICE, new HashSet<Type>(Arrays.asList(Type.FIRE, Type.WATER, Type.ICE, Type.STEEL)));
        strongAgainst.put(Type.FIGHTING, new HashSet<Type>(Arrays.asList(Type.POISON, Type.FLYING, Type.PSYCHIC, Type.BUG, Type.FAIRY)));
        strongAgainst.put(Type.POISON, new HashSet<Type>(Arrays.asList(Type.POISON, Type.GROUND, Type.ROCK, Type.GHOST)));
        strongAgainst.put(Type.GROUND, new HashSet<Type>(Arrays.asList(Type.GRASS, Type.BUG)));
        strongAgainst.put(Type.FLYING, new HashSet<Type>(Arrays.asList(Type.ELECTRIC, Type.ROCK, Type.STEEL)));
        strongAgainst.put(Type.PSYCHIC, new HashSet<Type>(Arrays.asList(Type.PSYCHIC, Type.STEEL)));
        strongAgainst.put(Type.BUG, new HashSet<Type>(Arrays.asList(Type.FIRE, Type.FIGHTING, Type.POISON, Type.FLYING, Type.GHOST, Type.STEEL, Type.FAIRY)));
        strongAgainst.put(Type.ROCK, new HashSet<Type>(Arrays.asList(Type.FIGHTING, Type.GROUND, Type.STEEL)));
        strongAgainst.put(Type.GHOST, new HashSet<Type>(Arrays.asList(Type.DARK)));
        strongAgainst.put(Type.DRAGON, new HashSet<Type>(Arrays.asList(Type.STEEL)));
        strongAgainst.put(Type.DARK, new HashSet<Type>(Arrays.asList(Type.DARK, Type.FAIRY, Type.FIGHTING)));
        strongAgainst.put(Type.STEEL, new HashSet<Type>(Arrays.asList(Type.FIRE, Type.WATER, Type.ELECTRIC, Type.STEEL)));
        strongAgainst.put(Type.FAIRY, new HashSet<Type>(Arrays.asList(Type.FIRE, Type.POISON, Type.STEEL)));
        

        return strongAgainst;
    }

}