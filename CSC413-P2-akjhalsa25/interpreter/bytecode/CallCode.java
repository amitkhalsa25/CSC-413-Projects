package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class CallCode extends ByteCode
{
    private String label;

    @Override
    public void init(ArrayList<String> str)
    {
        label = str.get(0);
    }

    @Override
    public void executeProgram(VirtualMachine VM)
    {
        VM.save();
        VM.setProgramCounter(Integer.parseInt(label));
    }

    @Override
    public String toString()
    {
        return "CALL " + label + "\n[]";
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