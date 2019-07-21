package stackandqueue.qs3;

import java.util.Stack;

/**
 * @author lhx
 * @date 2019/7/21 - 20:27
 *
 * 一个栈依次压入1、2、3、4、5，那么栈顶到栈底分别为5、4、3、2、1.将这个栈
 * 转置后，从栈顶到栈底为1、2、3、4、5，也就是实现栈中元素的逆序，但是只能
 * 用递归函数来实现。
 */
public class Solution3 {

    public void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = getAndRemoveLastElement(stack);
        reverseStack(stack);
        stack.push(temp);
    }

    public int getAndRemoveLastElement(Stack<Integer> stack) {
        int result = stack.pop();
        if (stack.isEmpty()) {
            return result;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }

    }

}
