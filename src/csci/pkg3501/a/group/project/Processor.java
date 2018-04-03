package csci.pkg3501.a.group.project;

<<<<<<< HEAD
public class Processor {
    
    //constructor
    Processor(){}
    
    //stub
    void setPC() {
=======
import java.util.Scanner;

public class Processor {
    private int[] reg = new int[8];
    private int PC;
    private int IR;
    private Scanner kbd = new Scanner(System.in);
    
    public void setPC(int pc) {
        PC = pc;
>>>>>>> ca8524e4200576ae5be492839998dea09c6f018a
    }

    //returns true if the program should halt
    public boolean step() {
        String cmd = kbd.next();
        //insert input validation here
        int opcode = getBase10(cmd.substring(7,8));
        int a = getBase10(cmd.substring(8,9));
        int b = getBase10(cmd.substring(9));
        if (opcode == 0) {
            return true;
        }
        //insert logic for other commands here
        return false;
    }
    
    public void dump() {
    }
    
<<<<<<< HEAD
    //stub
    void setMemory(Memory _memory){}
=======
    //converts hex string to base 10 int
    private int getBase10(String c) {
        switch(c) {
            case "1": return 1;
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
            case "6": return 6;
            case "7": return 7;
            case "8": return 8;
            case "9": return 9;
            case "A": return 10;
            case "B": return 11;
            case "C": return 12;
            case "D": return 13;
            case "E": return 14;
            case "F": return 15;
            default: return 0;
        }
    }
>>>>>>> f4cb99072ceee5b3db41656ef06adc53b90bd3e4
}
