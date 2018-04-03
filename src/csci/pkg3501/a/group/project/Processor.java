package csci.pkg3501.a.group.project;

import java.util.Scanner;

public class Processor {
    private int[] reg = new int[8];
    private int PC;
    private int IR;
    private Scanner kbd = new Scanner(System.in);
    
    public void setPC(int pc) {
        PC = pc;
    }

    //returns true if the program should halt
    public boolean step() {
        int cmd = kbd.nextInt();
        if (cmd <= 0x000000FF) { //halt for anything with opcode 0
            return true;
        }
        //insert logic for other commands here
        return false;
    }

    public void dump() {
    }
}
