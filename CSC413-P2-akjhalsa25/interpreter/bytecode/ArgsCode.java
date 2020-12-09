package interpreter.bytecode;
import interpreter.virtualmachine.VirtualMachine;
import java.util.ArrayList;

public class ArgsCode extends ByteCode {
    private String args;

    @Override
    public void init(ArrayList<String> str)
    {
        args = str.get(0);
    }

    @Override
    public void executeProgram(VirtualMachine virtualMachine)
    {
        virtualMachine.newframe(Integer.parseInt(args));
    }

    @Override
    public String toString()
    {
        return "\nARGS " + args + "\n[]";
    }
}
