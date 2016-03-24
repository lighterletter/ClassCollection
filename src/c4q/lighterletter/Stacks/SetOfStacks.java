package c4q.lighterletter.Stacks;

import java.util.Stack;

/**
 * Created by c4q-john on 3/23/16.
 * <p/>
 * Implement a structure set of stacks that behaves like a single stack and creates a new stack
 * once we pass a threshold.
 */
public class SetOfStacks {

    static final int maxHeight = 20;
    private int currentStackSize = 0;
    private Stack<Stack<Integer>> mainStack = new Stack<>();
    private Stack<Integer> currentStack = new Stack<Integer>();


    public void push(int n) {

        if (currentStack.size() < maxHeight) {
            currentStackSize++;
            currentStack.push(n);
        }

        if (currentStackSize == maxHeight) {
            mainStack.push(currentStack);
            currentStack = new Stack<>();
            currentStackSize = 0;
        }

    }

    public int pop() {


        if (currentStack.size() == 0 && mainStack.size() == 0) {
            return 0;
        }

        if (currentStack.size() == 0 && mainStack.size() != 0) {
            currentStack = mainStack.pop();
            currentStackSize = maxHeight;
            currentStackSize--;
            return currentStack.pop();
        }

        currentStackSize--;
        return currentStack.pop();

    }


}
