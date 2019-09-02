package wanmei;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author lhx
 * @date 2019/8/23 - 18:20
 */
public class MinMaxStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private Stack<Integer> maxStack;

    public MinMaxStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            minStack.push(data);
            maxStack.push(data);
            return;
        }

        if (data > maxStack.peek()) {
            maxStack.push(data);
        } else {
            maxStack.push(maxStack.peek());
        }

        if (data < minStack.peek()) {
            minStack.push(data);
        } else {
            minStack.push(minStack.peek());
        }

        stack.push(data);
    }

    public int pop() {
        minStack.pop();
        maxStack.pop();
        return stack.pop();
    }

    public int min() {
        return minStack.peek();
    }

    public int max() {
        return maxStack.peek();
    }

}

class TestStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinMaxStack stack = new MinMaxStack();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        stack.pop();
        System.out.println(stack.max() + "," + stack.min());
    }
}
