package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class DumpCode extends ByteCode {
    private String bool;
    @Override
    public void init(ArrayList<String> str)
    {
        bool = str.get(0);
    }

    @Override
    public void executeProgram(VirtualMachine virtualmachine)
    {
        if(bool.equals("ON"))
        {
            virtualmachine.setDumping(true);
        }
        else if(bool.equals("OFF"))
        {
            virtualmachine.setDumping(false);
        }
    }

    @Override
    public String toString()
    {
        return "DUMP ";
    }
}