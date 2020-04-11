package stack;

public class MyStack {
    private int[] data;
    private int top;
    private int size;
    public MyStack(int sizeOfArray){
        data= new int[sizeOfArray];
        top=0;
        size=0;
    }
    public void push(int element){
        if(isFull()){
            data[top]=element;
            top++;
            size++;
        }
        else {
            System.out.println("Stack is Overflow");
        }
    }

    public boolean isFull() {
        boolean res=false;
        if (top==data.length){
            res=true;
        }
        return res;
    }
    public int pop(){
        int res=0;
        if (isEmpty()){
            top--;
            size--;
            res=data[top];
        }
        else {
            System.out.println("Stack is Uderflow");
        }
        return res;
    }
    public boolean isEmpty() {
        boolean res=false;
        if(top==0){
            res=true;
        }
        return res;
    }
    public int peek(){
        int res=0;
        if(isEmpty()){
            res=data[top-1];
        }
        else {
            System.out.println("Stack is Underflow");
        }
        return res;
    }
    public int size(){
        return size;
    }
}
