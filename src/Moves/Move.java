package Moves;

import Types.Type;

public class Move {
    
    
    protected String name;
    protected Type type;
    protected int power;
    protected int accuracy;
    protected int pp;
    protected int maxPP;
    protected int priority;
    protected boolean isPhysical;
    protected boolean isSpecial;
    protected boolean isStatus;
    protected int targets;

    public Move(String name, Type type, int power, int accuracy, int pp, int maxPP, int priority, boolean isPhysical, boolean isSpecial, boolean isStatus, int targets) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.maxPP = maxPP;
        this.priority = priority;
        this.isPhysical = isPhysical;
        this.targets = targets;
    }


    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getPp() {
        return pp;
    }

    public int getMaxPP() {
        return maxPP;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isPhysical() {
        return isPhysical;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public boolean isStatus() {
        return isStatus;
    }

    public int getTargets() {
        return targets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public void setMaxPP(int maxPP) {
        this.maxPP = maxPP;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setPhysical(boolean isPhysical) {
        this.isPhysical = isPhysical;
    }

    public void setSpecial(boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    public void setStatus(boolean isStatus) {
        this.isStatus = isStatus;
    }

    public void setTargets(int targets) {
        this.targets = targets;
    }

    public String toString(){
        return name + " " + type + " " + power + " " + accuracy + " " + pp + " " + maxPP + " " + priority + " " + isPhysical + " " + isSpecial + " " + isStatus + " " + targets;
    }


}
