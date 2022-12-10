import java.util.Arrays;

public class MStack {
    private char[] arr;         //All stacks stored here
    private int maxSize ;      //Max size of array
    private int totalStack;    //How many stack users want
    private int[] stacksInArr; //I use this array to store every stack's starting point
    private int interval;      //I use this interval value in some calculations

    public MStack(int maxSize, int totalStack){
        this.maxSize = maxSize;
        this.totalStack = totalStack;
        this.arr = new char[maxSize];
        interval = (maxSize / totalStack);
        stacksInArr = new int[totalStack];
        splitStack();
    }


    //I construct stacksInArr here (which I use this array to store every stack's starting point)
    public void splitStack(){
        int splitter = interval;
        for (int i = 0; i<stacksInArr.length; i++){
            stacksInArr[i] = splitter;
            splitter+=interval;
        }
    }

    public void push(char ch, int stack){
        int givenStack = stacksInArr[stack-1];
        for (int i = givenStack-interval, x=0; x<interval;x++,i++){
            if (arr[i] == 0){
                arr[i] = ch;
                return;
            }
        }
        System.out.println("Stack over flow");
    }

    public void pop(int stack){
        boolean flag = true;
        int givenStack = stacksInArr[stack-1];
        for (int i = givenStack-1, x=0; x<interval;x++,i--){
            if (arr[i] != 0){
                System.out.println(arr[i]);
                arr[i] = 0;
                flag = false;
                return;
            }
        }
        if (flag){
            System.out.println("No more value in stack");
        }

    }

    @Override
    public String toString() {
        return "MStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
