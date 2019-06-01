package offer5;

/**
 * @author lhx
 * @date 2019/6/1 - 10:19
 */
public class TestStep {

    //求n步台阶一共有多少种走法
    public int f(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能小于一");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n - 2) + f(n - 1);
    }

}
