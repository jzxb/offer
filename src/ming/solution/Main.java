package ming.solution;

import java.util.Scanner;

/**
 * @author lhx
 * @date 2019/9/7 - 15:25
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double money = sc.nextDouble();
        rmb(money);
    }

    private static void rmb(Double money) {
        if (money < 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("人民币");
        String moneyStr = money + "";
        String[] split = moneyStr.split("\\.");
        switchInt(split[0], sb);
        switchFloat(split[1], sb);
        System.out.println(sb.toString());
    }

    private static void switchFloat(String s, StringBuilder sb) {
        sb.append("元");
        if (2 == s.length()) {
            numberToStr(s.substring(0, 1), sb);
            sb.append("角");
            numberToStr(s.substring(1), sb);
            sb.append("分");
        }
        if (1 == s.length() && !s.equals("0")) {
            numberToStr(s, sb);
            sb.append("角");
        } else {
            sb.append("整");
        }
    }

    private static void switchInt(String moneyStr, StringBuilder sb) {
        for (int i = 0; i < moneyStr.length(); i++) {
            if ("0".equals(moneyStr.substring(i, i + 1))) {
                while ("0".equals(moneyStr.substring(i, i + 1))) {
                    if (i == moneyStr.length() - 1) {
                        return;
                    } else {
                        i++;
                    }
                }
                sb.append("零");
            }
            if (moneyStr.length() - i >= 9) {
                String temp = moneyStr.substring(i, moneyStr.length() - 8);
                for (int j = 0; j < temp.length(); j++) {
                    switchMumber(temp.substring(j), sb);
                }
                sb.append("亿");
                i += moneyStr.length() - 9;
            } else if (moneyStr.length() - i >= 5) {
                String temp = moneyStr.substring(i, moneyStr.length() - 4);
                for (int j = 0; j < temp.length(); j++) {
                    switchMumber(temp.substring(j), sb);
                }
                sb.append("万");
                i += moneyStr.length() - 5;
            } else {
                switchMumber(moneyStr.substring(i), sb);
            }
        }
    }

    private static void switchMumber(String substring, StringBuilder sb) {
        if (4 == substring.length()) {
            numberToStr(substring.substring(0, 1), sb);
            sb.append("仟");
        }
        if (3 == substring.length()) {
            numberToStr(substring.substring(0, 1), sb);
            sb.append("佰");
        }
        if (2 == substring.length()) {
            if (isOne(substring.substring(0, 1))) {
                sb.append("拾");
            } else {
                numberToStr(substring.substring(0, 1), sb);
                sb.append("拾");
            }
        }
        if (1 == substring.length()) {
            numberToStr(substring, sb);
        }
    }

    private static boolean isOne(String substring) {
        if (substring.substring(0, 1).equals("1")) {
            return true;
        } else {
            return false;
        }
    }

    private static void numberToStr(String substring, StringBuilder sb) {
        switch (substring) {
            case "1":
                sb.append("壹");
                break;
            case "2":
                sb.append("贰");
                break;
            case "3":
                sb.append("叁");
                break;
            case "4":
                sb.append("肆");
                break;
            case "5":
                sb.append("伍");
                break;
            case "6":
                sb.append("陆");
                break;
            case "7":
                sb.append("柒");
                break;
            case "8":
                sb.append("捌");
                break;
            case "9":
                sb.append("玖");
                break;
        }
    }

}
