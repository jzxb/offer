package offer5;

/**
 * @author lhx
 * @date 2019/6/1 - 10:38
 */
public class TestStep2 {

    public int loop(int n){
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能小于一");
        }
        if (n == 1 || n == 2) {
            return n;
        }

        int one = 2;//初始化为走到第二级台阶的走法
        int two = 1;//初始化为走到第一级台阶的走法
        int sum = 0;
        for (int i = 3; i <= n;i++){
            //最后跨两步 + 跨一步的走法
           sum = two + one;
           two = one;
           one = sum;
        }
        return sum;
    }

}
