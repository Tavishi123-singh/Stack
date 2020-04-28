/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package main;

import java.util.Random;
import stack.MyStack;
public class Main {
    public static void main(String[] args) {
        MyStack obj=new MyStack(10);
        int ele=obj.peek();
        ele=obj.pop();
        boolean check=obj.isEmpty();
        System.out.println("Size of Stack: "+obj.size());
        obj.push(500);
        System.out.println("Size of Stack: "+obj.size());
        for (int i = 0; i < 100; i++) {
            obj.push(new Random().nextInt(100));
        }
        System.out.println("Size of Stack: "+obj.size());
    }
}
