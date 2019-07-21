package stackandqueue.qs1;

import java.util.Stack;

/**
 * @author lhx
 * @date 2019/7/21 - 18:30
 *
 * 实现一个特殊的栈，在实现栈的基本功能上，再实现返回栈中最小的元素
 *
 * pop、push、getMin操作的时间复杂度都是O(1)
 * 可以使用现成的栈结构
 */
public class SolutionOne {

    private Stack<Integer> numStack;

    private Stack<Integer> minStack;

    public SolutionOne() {
        this.numStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int newNum) {
        if (minStack.isEmpty()) {
            minStack.push(newNum);
        } else if (minStack.peek() > newNum) {
            minStack.push(newNum);
        } else {
            minStack.push(minStack.peek());
        }
        numStack.push(newNum);
    }

    public int pop() {
        if (numStack.isEmpty()) {
            throw new RuntimeException("栈空");
        }
        minStack.pop();
        return numStack.pop();
    }

    public int getMin() {
        if (numStack.isEmpty()) {
            throw new RuntimeException("栈空");
        }
        return minStack.peek();
    }

}
