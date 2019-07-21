package stackandqueue.qs2;

import java.util.Stack;

/**
 * @author lhx
 * @date 2019/7/21 - 18:39
 *
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）
 */
public class SolutionTwo {

    public static void main(String[] args) {
        SolutionTwo solutionTwo = new SolutionTwo();
        solutionTwo.add(1);
        solutionTwo.add(2);
        solutionTwo.add(3);
        solutionTwo.add(4);
        System.out.println(solutionTwo.peek());
        System.out.println(solutionTwo.poll());
        System.out.println(solutionTwo.peek());
    }

    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public SolutionTwo() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    public void add(int num) {
        stackPush.push(num);
    }

    public int poll() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("队列空");
        } else if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("队列空");
        } else if (stackPop.isEmpty()) {
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }

}
