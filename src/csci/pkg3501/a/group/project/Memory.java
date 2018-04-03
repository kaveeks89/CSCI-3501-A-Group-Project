package csci.pkg3501.a.group.project;

public class Memory {

    int cap; //capacity
    int[] cell;

    //constructor
    Memory(int _cap) {

        cell = new int[cap];
    }

    //stub
    int read(int _address) {
        return 0;
    }

    //stub
    void setMemory() {
    }

    //stub
    void write(int _address, int _data) {
    }

    //stub
    void dump() {
        
        for (int i = 0; i < cell.length; i++) {
            cell[i] = -1; //-1 is how I'm defining an empty cell
        }
        
        System.out.println("\033[32m" +"Memory dump complete.");
    }
}
