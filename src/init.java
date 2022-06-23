import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Moves.Move;
import Types.Type;

public class init {
    
    //read src/Pokemon/moves.txt
    public ArrayList<Move> initMoves(){
            Scanner scan;
            ArrayList<Move> moves = new ArrayList<Move>();
            try {
                scan = new Scanner(new File("src/Pokemon/moves.txt"));
                while(scan.hasNextLine()){
                    boolean isSpecial = false;
                    boolean isPhysical = false;
                    boolean isStatus = false;
                    String line = scan.nextLine();
                    String[] split = line.split("\t");
                    String name = split[1];
                    Type type = valueOf(split[2]);
                    String category = split[3].toLowerCase().equals("status") ? "status" : (split[3].toLowerCase().equals("physical") ? "physical" : "special");
                    switch(category){
                        case "status":
                            isStatus = true;
                            break;
                        case "physical":
                            isPhysical = true;
                            break;
                        case "special":
                            isSpecial = true;
                            break;
                    }
                    int pp = Integer.parseInt(split[4].replace("*", ""));
                    int power = split[5].toLowerCase().contains("—") ? 0 : Integer.parseInt(split[5].replace("*", ""));
                    int accuracy = split[6].toLowerCase().contains("—") ? 0 : Integer.parseInt(split[6].replace("%", "").replace("*", ""));
                    moves.add(new Move(name, type, power, accuracy, pp, pp, 0, isPhysical, isSpecial, isStatus, 1));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            return moves;
        }


        public static Type valueOf(String s){
            switch (s.toLowerCase()) {
                case "normal":
                    return Type.NORMAL;
                case "fire":
                    return Type.FIRE;
                case "water":
                    return Type.WATER;
                case "grass":
                    return Type.GRASS;
                case "electric":
                    return Type.ELECTRIC;
                case "ice":
                    return Type.ICE;
                case "fighting":
                    return Type.FIGHTING;
                case "poison":
                    return Type.POISON;
                case "ground":
                    return Type.GROUND;
                case "flying":
                    return Type.FLYING;
                case "psychic":
                    return Type.PSYCHIC;
                case "bug":
                    return Type.BUG;
                case "rock":
                    return Type.ROCK;
                case "ghost":
                    return Type.GHOST;
                case "dragon":
                    return Type.DRAGON;
                case "dark":
                    return Type.DARK;
                case "steel":
                    return Type.STEEL;
                case "fairy":
                    return Type.FAIRY;
                default:
                    return Type.NONE;
        }
    }
    


    }
