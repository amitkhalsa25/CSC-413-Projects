package interpreter.bytecode;

import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class HaltCode extends ByteCode{
    @Override
    public void init(ArrayList<String> str) {
        //No Arguments needed
    }

    @Override
    public void executeProgram(VirtualMachine virtualmachine)
    {
        virtualmachine.running(false);
    }

    @Override
    public String toString()
    {
        return "HALT \n";
    }
}
