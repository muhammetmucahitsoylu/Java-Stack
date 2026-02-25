public class StackX {

    private char[] stackArray;
    private int maxSize;
    private int top;

    public StackX(int max) {
        this.maxSize = max;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(char a) {
        if (!isFull()) {
            stackArray[++top] = a;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }
        return '\0';
    }

    public char peek() {
        if (!isEmpty()) {
            return stackArray[top];
        }
        return '\0';
    }

    public void clear() {
        this.top = -1;
    }
}