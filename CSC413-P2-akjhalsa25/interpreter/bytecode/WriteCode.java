package interpreter.bytecode;


import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class WriteCode extends ByteCode {
    @Override
    public void init(ArrayList<String> str) { }

    @Override
    public void executeProgram(VirtualMachine virtualmachine)
    {
        Integer value = virtualmachine.peek();
        //Print statement include WRITE\n
        System.out.println("WRITE\n" + value.toString());
    }

    //toString method
    @Override
    public String toString()
    {
        return "WRITE \n[]";
    }
}