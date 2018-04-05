package csci.pkg3501.a.group.project;

import java.util.Scanner;

public class Processor {

    private Memory memory;
    private int[] reg = new int[8];
    private int PC;
    private int IR;
    private Scanner kbd = new Scanner(System.in);

    public void setPC(int pc) {
        PC = pc;
    }

    //returns true if the program should halt
    public boolean step() {
        IR = memory.read(PC++);
        String cmd = Integer.toHexString(memory.read(IR));
        int opcode = getBase10(cmd.substring(7, 8));
        int a = getBase10(cmd.substring(8, 9));
        int b = getBase10(cmd.substring(9));
        if (opcode == 0) { //halt
            return true;
        } else if (opcode == 1) { //load
            reg[a] = memory.read(reg[b]);
        } else if (opcode == 2) { //loadc
            reg[a] = memory.read(PC++);
        } else if (opcode == 3) { //store
            memory.write(reg[a], reg[b]);
        } else if (opcode == 4) { //add
            reg[a] = reg[a] + reg[b];
        } else if (opcode == 5) { //mul
            reg[a] = reg[a] * reg[b];
        } else if (opcode == 6) { //sub
            reg[a] = reg[a] - reg[b];
        } else if (opcode == 7) { //div
            reg[a] = reg[a] / reg[b];
        } else if (opcode == 8) { //and
            if (reg[a] != 0 && reg[b] != 0) {
                reg[a] = 1;
            } else {
                reg[a] = 0;
            }
        } else if (opcode == 9) { //or
            if (reg[a] != 0 || reg[b] != 0) {
                reg[a] = 1;
            } else {
                reg[a] = 0;
            }
        } else if (opcode == 10) { //not
            if (reg[b] != 0) {
                reg[a] = 0;
            } else {
                reg[a] = 1;
            }
        } else if (opcode == 11) { //lshift
            reg[a] = reg[b] << 1;
        } else if (opcode == 12) { //rshift
            reg[a] = reg[b] >> 1;
        } else if (opcode == 13) { //bwc
            reg[a] = reg[a] & reg[b];
        } else if (opcode == 14) { //bwd
            reg[a] = reg[a] | reg[b];
        } else if (opcode == 15) { //if
            if (reg[a] != 0) {
                PC = reg[b];
            }
        }
        return false;
    }

    public void dump() {
    }

    //converts hex string to base 10 int
    private int getBase10(String c) {
        switch (c) {
            case "1":
                return 1;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "A":
                return 10;
            case "B":
                return 11;
            case "C":
                return 12;
            case "D":
                return 13;
            case "E":
                return 14;
            case "F":
                return 15;
            default:
                return 0;
        }
    }
}

