public class Main {
    public static void main(String[] args) {
        MStack mStack = new MStack(18,6);
        mStack.push('a',1);
        mStack.push('b',1);
        mStack.push('a',2);
        mStack.push('b',2);
        mStack.push('a',3);
        mStack.push('b',3);
        mStack.push('a',4);
        mStack.push('b',4);
        mStack.push('a',5);
        mStack.push('b',5);
        mStack.push('a',6);
        mStack.push('b',6);
        System.out.println("Before popped " + mStack);
        mStack.pop(1);
        System.out.println("After popped " + mStack);
    }
}