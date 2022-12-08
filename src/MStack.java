import java.util.Arrays;

public class MStack {
    private char[] arr;
    private int maxSize = 10;
    private int stackSize = 2;
    private int[] stacksInArr;


    public MStack(int maxSize, int stackSize){
        this.maxSize = maxSize;
        this.stackSize = stackSize;
        this.arr = new char[maxSize];
        stacksInArr = new int[maxSize/stackSize];
    }

    private int interval = (this.maxSize / this.stackSize);

    public void splitStack(){
        for (int i = 0; i<stacksInArr.length; i++){
            stacksInArr[i] = interval;
            interval+=interval;
        }
    }

    public void push(char ch, int stack){
        int givenStack = stacksInArr[stack+1];
        for (int i = givenStack; i<interval;i++){
            if (arr[givenStack] == 0){
                arr[givenStack] = ch;
                return;
            }
        }
        System.out.println("Stack over flow");
    }


}
