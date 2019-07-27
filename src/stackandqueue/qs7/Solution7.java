package stackandqueue.qs7;

import java.util.LinkedList;

/**
 * @author lhx
 * @date 2019/7/27 - 19:55
 *
 * 有一个整数数组arr和一个大小为w的窗口从数组的最左边滑倒最右边，窗口每次向右滑一个位置。
 * 如，数组为[4，3，5，4，3，3，6，7]，窗口大小为3时，结果为5 5 5 4 6 7
 * 如果数组长度为n，窗口大小为w，则一共产生n-w+1个窗口的最大值
 * 实现一个函数：
 *      输入：整形数组arr，窗口大小为w
 *      输出：一个长度为n-w+1的数组res，res[i]表示每一种窗口状态下的最大值
 */
public class Solution7 {

    public static int[] maxArr(int[] arr, int w) {
        if (arr == null || w < 1 || arr.length < w) {
            return null;
        }
        LinkedList<Integer> qmax = new LinkedList<>();
        int[] res = new int[arr.length - w +1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);
            if (qmax.peekFirst() == i - w) {
                qmax.pollFirst();
            }
            if (i >= w - 1) {
                res[index++] = arr[qmax.peekFirst()];
            }
        }
        return res;
    }

}
