package interpreter.bytecode;
import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class ReadCode extends ByteCode {
    @Override
    public void init(ArrayList<String> str) {
        //No arguments
    }
    @Override
    public void executeProgram(VirtualMachine virtualmachine)
    {
        int result = virtualmachine.read();
        virtualmachine.push(result);

    }
    @Override
    public String toString()
    {
        return "READ \n[]";
    }
}