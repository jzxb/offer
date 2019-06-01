package offer6;

/**
 * @author lhx
 * @date 2019/6/1 - 10:59
 */
public class Exam6 {

    static int s;//成员变量、类变量
    int i;//成员变量、实例变量
    int j;//成员变量、实例变量

    {
        int i =1;//非静态代码块中的局部变量i
        i++;
        j++;
        s++;
    }

    public void test(int j){//形参，局部变量j
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {
        Exam6 obj1 = new Exam6();//局部变量obj1
        Exam6 obj2 = new Exam6();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i + "," + obj1.j +"," + obj1.s);
        System.out.println(obj2.i + "," + obj2.j +"," + obj2.s);
    }

}
