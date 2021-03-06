
public class Stack {
    private final static int DEFSIZE = 32;
    private final char[] array;
    private int head;
    public Stack() {
        array = new char[DEFSIZE];
        head = 0;
    }
    public final void push(char c) {
        array[head++] = c;
    }
    public final char pull() {
        return array[--head];
    }
    public final char top() {
        return array[head-1];
    }
}
