package interpreter.bytecode;
import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;



public class StoreCode extends ByteCode{
    private String offset;
    private String id;
    private int val;

    @Override
    public void init(ArrayList<String> str)
    {
        offset = str.get(0);
        id = str.get(1);
    }

    @Override
    public void executeProgram(VirtualMachine virtualMachine)
    {
        virtualMachine.storeCode(Integer.parseInt(offset));
        val = virtualMachine.peek();
    }

    @Override
    public String toString()
    {
        return "STORE " + offset + " " + id + " " + id + " = " + val + "\n[]";
    }
}