package csci.pkg3501.a.group.project;

public class Memory {

    int cap; //capacity
    int[] cell; //Memory contains an array of integer cells
    
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
            System.out.println(cell[i]);
        }

    }
}
