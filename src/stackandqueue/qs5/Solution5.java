package stackandqueue.qs5;

import java.util.Stack;

/**
 * @author lhx
 * @date 2019/7/22 - 20:41
 *
 * 一个栈中的元素的类型为整型，现在想将该栈从顶到底按照从大到小排序，只允许申请一个栈。
 * 除此之外可以申请新的变量，但是不能申请额外的数据结构。
 */
public class Solution5 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(1);
        stack.push(0);
        sortStackByStack(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void sortStackByStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        int min = 0;
        for (int i = stack.size(); i > 0; i--) {
            min = stack.pop();
            for (int j = i - 1; j > 0; j--) {
                if (stack.peek() < min) {
                    temp.push(min);
                    min = stack.pop();
                } else {
                    temp.push(stack.pop());
                }
            }
            stack.push(min);
            while (!temp.isEmpty()) {
                stack.push(temp.pop());
            }
        }
    }

}
