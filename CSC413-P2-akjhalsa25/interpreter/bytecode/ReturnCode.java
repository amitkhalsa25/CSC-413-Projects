package interpreter.bytecode;


import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class ReturnCode extends ByteCode {
    private String label;
    @Override
    public void init(ArrayList<String> str){
        if(!str.isEmpty())
        {
            //Set 0
            label = str.get(0);
        }
        else
        {
            label = "NULL";
        }
    }

    @Override
    public void executeProgram(VirtualMachine virtualmachine)
    {
        virtualmachine.popFrame();
        int result = virtualmachine.returnPop();
        virtualmachine.setProgramCounter(result);
    }

    @Override
    public String toString()
    {
        if(label.equals("NULL"))
        {
            return "RETURN \n";
        }
        else
        {
            return "RETURN factorial  exit\n" + label + "\n";
        }
    }
}
