package interpreter.bytecode;
import interpreter.virtualmachine.VirtualMachine;
import java.util.ArrayList;

public class LabelCode extends ByteCode {
    private String label;

    @Override
    public void init(ArrayList<String> str)
    {
        label = str.get(0);
    }
    @Override
    public void executeProgram(VirtualMachine virtualmachine) { }
    @Override
    public String toString()
    {
        return "LABEL ";
    }
    public String getLabel()
    {
        return label;
    }
}
