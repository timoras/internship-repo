package lt.timoras.toDo;


public class StackExercise {

    private static final int STACK_SIZE = 100;
    private static int stackPointer = 0;
    int[] stack;

    public StackExercise() {
        stack = new int[STACK_SIZE];
    }

    public static int getSTACK_SIZE() {
        return STACK_SIZE;
    }

    public static int getStackPointer() {
        return stackPointer;
    }

    public int[] getStack() {
        return stack;
    }

    public boolean isEmpty() {
        if(stackPointer == 0){
            return true;
        }
        return false;
    }

    public void push(int i) {
        stack[stackPointer] = i;
        stackPointer++;
    }

    public void pop() {
        stack[stackPointer] = 0;
        stackPointer--;
    }

    public int top() {
        return stack[stackPointer-1];
    }

}
