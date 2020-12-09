package interpreter.bytecode;
import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public abstract class ByteCode {
    public abstract void init(ArrayList<String> str);
    public abstract void executeProgram(VirtualMachine virtualMachine);
    @Override
    public  abstract String toString();

}





