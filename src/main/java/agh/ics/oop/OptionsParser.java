package agh.ics.oop;


import java.util.Arrays;

public class OptionsParser {


    public MoveDirection[] parse(String[] args){

        int n = args.length;
        MoveDirection [] moves = new MoveDirection[n];


        int i = 0;
        for(String arg : args){
            MoveDirection dir = MoveDirection.NONE;
            switch(arg){
                case "f", "forward" -> dir = MoveDirection.FORWARD;
                case "b", "backward" -> dir = MoveDirection.BACKWARD;
                case "l", "left" -> dir = MoveDirection.LEFT;
                case "r", "right" -> dir = MoveDirection.RIGHT;
            }

            if(!dir.equals(MoveDirection.NONE)){
                moves[i] = dir;
                i += 1;
            }
        }

        return Arrays.copyOfRange(moves, 0,i);
    }
}
