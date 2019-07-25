package stackandqueue.qs6;

import java.util.Stack;

/**
 * @author lhx
 * @date 2019/7/24 - 19:39
 *
 * 汉诺塔
 * 不能直接从左到右或从右到左，必须经过中间
 */
public class Solution6 {

    public int hanoi(int num, String left, String mid, String right) {
        if (num < 1) {
            return 0;
        }
        return process(num, left, mid, right, left, right);
    }

    public int process(int num, String left, String mid, String right, String from, String to) {
        if (num == 1) {
            if (from.equals(mid) || to.equals(mid)) {
                System.out.println("移动1从" + from + "到" + to);
                return 1;
            } else {
                System.out.println("移动1从" + from + "到" + mid);
                System.out.println("移动1从" + mid + "到" + to);
                return 2;
            }
        }
        if (from.equals(mid) || to.equals(mid)) {
            String another = (from.equals(left) || to.equals(left) ? right : left);
            int part1 = process(num - 1, left, mid, right, from, another);
            int part2 = 1;
            System.out.println("移动" + num + "从" + from + "到" + to);
            int part3 = process(num - 1, left, mid, right, another, to);
            return part1 + part2 + part3;
        } else {
            int part1 = process(num - 1, left, mid, right, from, to);
            int part2 = 1;
            System.out.println("移动" + num + "从" + from + "到" + mid);
            int part3 = process(num - 1, left, mid, right, to, from);
            int part4 = 1;
            System.out.println("移动" + num + "从" + mid + "到" + to);
            int part5 = process(num - 1, left, mid, right, from, to);
            return part1 + part2 + part3 + part4 + part5;
        }
    }

    public int hanoi2(int num, String left, String mid, String right) {
        Stack<Integer> lS = new Stack<>();
        Stack<Integer> mS = new Stack<>();
        Stack<Integer> rS = new Stack<>();
        lS.push(Integer.MAX_VALUE);
        mS.push(Integer.MAX_VALUE);
        rS.push(Integer.MAX_VALUE);
        for (int i = num; i > 0; i--) {
            lS.push(i);
        }
        Action[] record = { Action.No };
        int step = 0;
        while (rS.size() != num + 1) {
            step += fStackToStack(record, Action.MToL, Action.LToM, lS, mS, left, mid);
            step += fStackToStack(record, Action.LToM, Action.MToL, mS, lS, mid, left);
            step += fStackToStack(record, Action.RToM, Action.MToR, mS, rS, mid, right);
            step += fStackToStack(record, Action.MToR, Action.RToM, rS, mS, right, mid);
        }
        return step;
    }

    public int fStackToStack(Action[] record, Action proNoAct, Action nowAct, Stack<Integer> fStack, Stack<Integer> tStack, String from, String to) {
        if (record[0] != proNoAct && fStack.peek() < tStack.peek()) {
            tStack.push(fStack.pop());
            System.out.println("移动" + tStack.peek() + "从" + from + "到" + to);
            record[0] = nowAct;
            return 1;
        }
        return 0;
    }

}

enum Action {
    No, LToM, MToL, MToR, RToM
}
