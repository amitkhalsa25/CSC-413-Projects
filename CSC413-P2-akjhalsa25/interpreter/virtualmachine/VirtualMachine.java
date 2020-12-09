package interpreter.virtualmachine;


import interpreter.bytecode.ByteCode;

import java.util.Scanner;
import java.util.Stack;

public class VirtualMachine {
    private RunTimeStack   runTimeStack;
    private Stack<Integer> returnAddress;
    private Program        program;
    private int            programCounter;
    private boolean        isRunning;
    private boolean dumping;

    public VirtualMachine(Program program) {
        this.program = program;
    }

    public void executeProgram() {
        programCounter = 0;
        runTimeStack = new RunTimeStack();
        returnAddress = new Stack<Integer>();
        isRunning = true;
        dumping = true;
        while(isRunning) {
            ByteCode code = program.getCode(programCounter);
            code.executeProgram(this);
            isDumping(code);
            programCounter++;
        }
    }

    public void setDumping(boolean bool) {
        this.dumping = bool;
    }

    public void isDumping(ByteCode code) {
        if(dumping) {
            System.out.print(code.toString());
            runTimeStack.dump();
        }
    }

    public void newframe(int n) {
        runTimeStack.newFrameAt(n);
    }

    public int peek() {
        return runTimeStack.peek();
    }

    public int pop() {
        return runTimeStack.pop();
    }

    public void popFrame() {
        runTimeStack.popFrame();
    }

    public void push(int n) {
        runTimeStack.push(n);
    }

    public void setProgramCounter(int programCounter) {
        this.programCounter = programCounter;
    }

    public int returnPop() {
        return (int)returnAddress.pop();
    }

    public void save() {
        returnAddress.push(programCounter);
    }

    public void running(boolean bool) {
        isRunning = bool;
    }

    public void storeCode(int offset) {
        runTimeStack.store(offset);
    }

    public void loadCode(int offset) {
        runTimeStack.load(offset);
    }

    public void popStack(int stack) {
        int n = stack;
        if(n < runTimeStack.stackSize()) {
            while(n > -1) {
                runTimeStack.pop();
                n--;
            }
        }
    }
    //Read method, set input
    public int read() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        return scan.nextInt();
    }
}