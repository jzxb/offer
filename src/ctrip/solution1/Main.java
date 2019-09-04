package ctrip.solution1;

/**
 * @author lhx
 * @date 2019/9/4 - 19:20
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        ListNode lHead = null;
        ListNode temp = new ListNode(0);
        lHead = temp;
        temp.next = head;
        ListNode cur = null;
        ListNode node = null;
        while (null != temp.next) {
            if (temp.next.val <= m) {
                if (null == cur) {
                    node = new ListNode(temp.next.val);
                    cur = node;
                } else {
                    node.next = new ListNode(temp.next.val);
                    node = node.next;
                }
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        if (null == cur) {
            return head;
        } else {
            if (null == lHead.next) {
                return cur;
            } else {
                node.next = lHead.next;
                return cur;
            }
        }
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        while(in.hasNextInt()){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}
