package interpreter.bytecode;
import interpreter.virtualmachine.VirtualMachine;

import java.util.ArrayList;

public class BopCode extends ByteCode{
    private String operator;

    @Override
    public void init(ArrayList<String> str){
        operator = str.get(0);
    }

    @Override
    public void executeProgram(VirtualMachine virtualMachine) {
        int pop1 = virtualMachine.pop();
        int pop2 = virtualMachine.pop();
        int result = 0;

         switch (operator){
            case "+":
                result = pop1 + pop2;
                break;
            case "-":
                result = pop2 - pop1;
                break;
            case "*":
                result = pop1 * pop2;
                break;
            case "/":
                result = pop2 / pop1;
                break;
            case "==":
                if(pop2 == pop1) {
                    result = 1;
                }
                else {
                    result = 0;
                }
                break;
            case "!=":
                if(pop2 != pop1) {
                    result = 1;
                }
                else {
                    result = 0;
                }
                break;
            case "<":
                if(pop2 < pop1) {
                    result = 1;
                }
                else {
                    result = 0;
                }
                break;
            case ">":
                if(pop2 > pop1) {
                    result = 1;
                }
                else {
                    result = 0;
                }
                break;
            case "<=":
                if(pop2 <= pop1) {
                    result = 1;
                }
                else {
                    result = 0;
                }
                break;
            case ">=":
                if(pop2 >= pop1) {
                    result = 1;
                }
                else {
                    result = 0;
                }
                break;
            case "&":
                if(pop2 == 1 && pop1 == 1) {
                    result = 1;
                }
                else {
                    result = 0;
                }
                break;
            case "|":
                if(pop2 == 1 || pop1 == 1) {
                    result = 1;
                }
                else {
                    result = 0;
                }
                break;
            default:
                break;
        }
        virtualMachine.push(result);
    }
    @Override
    public String toString() {
        return "BOP " + " " + operator + "\n[]";
    }
}