package csci.pkg3501.a.group.project;

import java.util.Scanner;

public class Processor {

    private int[] reg = new int[8];
    private int PC; //program counter
    private int IR; //instruction register
    private Scanner kbd = new Scanner(System.in);
    private Memory memory;

    public void setPC(int pc) {
        PC = pc;
    }

    public void setMemory(Memory _memory) {
        memory = _memory;
    }

    //Stub
    public void execute() {
        /*
        IR = 0;
        //insert input validation here
        int opcode = getBase10(cmd.substring(7, 8)); //third to last digit is the opcode
        int a = getBase10(cmd.substring(8, 9)); //second to last digit is a register
        int b = getBase10(cmd.substring(9));//very last digit is b register
        if (opcode == 0) {
            return true;
        }
         */
    }

    //returns true if the program should halt
    /*
    128-255 could be instructions
     */
    public boolean step() {

        IR = reg[PC++];

        if (IR == 0) {
            return false; //stop stepping
        } else {
            execute();
            return true; //keep stepping
        }

    }

    public void dump() {

        for (int i = 0; i < reg.length; i++) {
            System.out.println(reg[i]);
        }

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

    private int getBase10FullString(String str) {

        String built = "";

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            switch (temp) {
                case '1':
                    built += '1';
                    break;
                case '2':
                    built += '2';
                    break;
                case '3':
                    built += '3';
                    break;
                case '4':
                    built += '4';
                    break;
                case '5':
                    built += '5';
                    break;
                case '6':
                    built += '6';
                    break;
                case '7':
                    built += '7';
                    break;
                case '8':
                    built += '8';
                    break;
                case '9':
                    built += '9';
                    break;
                case 'A':
                    built += "10";
                    break;
                case 'B':
                    built += "11";
                    break;
                case 'C':
                    built += "12";
                    break;
                case 'D':
                    built += "13";
                    break;
                case 'E':
                    built += "14";
                    break;
                case 'F':
                    built += "15";
                    break;

            }

        }

        return Integer.parseInt(built);
    }

}
