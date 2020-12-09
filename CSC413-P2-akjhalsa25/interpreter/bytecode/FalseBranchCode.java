package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;
import java.util.ArrayList;

public class FalseBranchCode extends ByteCode {
    private String label;
    int address;

    @Override
    public void init(ArrayList<String> str)
    {
        label = str.get(0);
    }

    @Override
    public void executeProgram(VirtualMachine virtualmachine)
    {
        if(virtualmachine.pop() == 0)
        {
            virtualmachine.setProgramCounter(Integer.parseInt(label));
        }

    }

    @Override
    public String toString()
    {
        return "FALSEBRANCH " + label + "\n[]";
    }

    public void setLabel(int index)
    {
        label = Integer.toString(index);
    }

    public String getLabel()
    {
        return label;
    }

}