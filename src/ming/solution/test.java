package ming.solution;

/**
 * @author lhx
 * @date 2019/9/7 - 16:36
 */
public class test {

    public static void main(String[] args) {
        String s = "";
        String a = a(s);
        System.out.println(a);
    }

    private static String a(String str) {
        try {
            str += "a";
            return str + b(str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            str += "e";
            return str + b(str) + "f";
        }
    }

    private static String b(String str) {

        try {
            str += "b";
            return "c";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            str += "d";
            return str;
        }
    }

}
