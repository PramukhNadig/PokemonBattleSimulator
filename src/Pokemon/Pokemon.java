package Pokemon;

import java.util.HashSet;

import Moves.Move;
import Types.Type;
import Types.Types;

public class Pokemon {
    
    protected String name;
    protected Type type;
    protected Type secondaryType;
    protected int level;
    protected int hp;
    protected int maxHp;
    protected int attack;
    protected int defense;
    protected int speed;
    protected int spAttack;
    protected int spDefense;
    protected int exp;
    protected int expToNextLevel;
    HashSet<Move> moves;
    protected HashSet<Type> weaknesses;
    
    public Pokemon(String name, Type type, Type secondaryType, int level, int hp, int attack, int defense, int speed, int spAttack, int spDefense, HashSet<Move> moves) {
        this.name = name;
        this.type = type;
        this.secondaryType = secondaryType;
        this.level = level;
        this.hp = hp;
        this.maxHp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.exp = 0;
        this.expToNextLevel = 100;
        this.moves = moves;
        Types types = new Types();
        this.weaknesses = types.makeHalfEffectHashMap().get(type);
    }

    public int calcDamage(Move move, Pokemon target){
        if(!moves.contains(move)){
            return -1;
        }


        int dmg = 0;

        int critDMG = 2;
        boolean crit = Math.random() < 0.1;
        if(move.isPhysical()){
            dmg = (int)((((2*level)/5)+2)*move.getPower()*((this.attack/target.getDefense()))/50)+2;
        }
        else{
            dmg = (int)((((2*level)/5)+2)*move.getPower()*((this.spAttack/target.getSpDefense()))/50)+2;
        }

        if(weaknesses.contains(target.getType())){
            dmg /= 2;
        }

        if(crit){
            dmg *= critDMG;
        }

        return dmg;
    }

    public int attack(Pokemon target, Move move){
        int dmg = calcDamage(move, target);
        if(dmg == -1){
            return -1;
        }
        target.takeDamage(dmg);
        return dmg;
    }

    public Pokemon battle(Pokemon target){
        int turn = 0;
        int trueTurn = 0;
        while(target.getHp() > 0 && hp > 0){
            Move move = target.selectRandomMove();
            Move attack = selectRandomMove();
            System.out.println(name + ": " + getHp());
            System.out.println(target.getName() + ": " + target.getHp());
            int dmg1 = attack(target, attack);
            System.out.println(name + " used " + move.getName() + " on " + target.getName() + " for " + dmg1 + " damage!");
            int dmg2 = target.attack(this, move);
            System.out.println(target.getName() + " used " + attack.getName() + " on " + name + " for " + dmg2 + " damage!");

            if(dmg1 == 0 && dmg2 == 0){
                turn++;
            }else{
                turn = 0;
            }
            
            trueTurn++;
            if(trueTurn == 1000){
                System.out.println("It's a tie!");
                return null;
            }

            if(turn == 75){
                System.out.println("It's a tie!");
                return null;
            }
        }
        
        if(target.getHp() <= 0 && this.getHp() <= 0){
            return null;
        }

        if(target.getHp() <= 0){
            System.out.println(name + " won!");
            return this;
        }
        else{
            System.out.println(target.getName() + " won!");
            return target;
        }
    }
    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }

    public int getExp() {
        return exp;
    }

    public int getExpToNextLevel() {
        return expToNextLevel;
    }

    public HashSet<Move> getMoves() {
        return moves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }

    public void setSpDefense(int spDefense) {
        this.spDefense = spDefense;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setExpToNextLevel(int expToNextLevel) {
        this.expToNextLevel = expToNextLevel;
    }

    public void setMoves(HashSet<Move> moves) {
        this.moves = moves;
    }

    public void addMove(Move move) {
        moves.add(move);
    }

    public void removeMove(Move move) {
        moves.remove(move);
    }

    public void addExp(int exp) {
        this.exp += exp;
    }

    public void levelUp() {
        level++;
        expToNextLevel *= 2;
        hp += 10;
        attack += 2;
        defense += 2;
        speed += 2;
        spAttack += 2;
        spDefense += 2;
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public void restoreHp() {
        hp = maxHp;
    }

    public void restoreHp(int hp) {
        if(maxHp > this.hp + hp){
            restoreHp();
        }
        this.hp = hp;
    }

    public Move selectRandomMove() {
        int index = (int) (Math.random() * moves.size());
        return moves.toArray(new Move[moves.size()])[index];
    }
}
