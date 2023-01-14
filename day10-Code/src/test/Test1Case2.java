package test;

import java.util.Scanner;

public class Test1Case2 {
    public static void main(String[] args) {
        /* 键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字
               将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系：
        Ⅰ－1、Ⅱ－2、Ⅲ－3、Ⅳ－4、Ⅴ－5、Ⅵ－6、Ⅶ－7、Ⅷ－8、Ⅸ－9
        注意点：
        罗马数字里面是没有0的
        如果键盘录入的数字包含0，可以变成""(长度为0的字符串)*/

        //分析：
        //1、键盘录入（对数据做判断）giluy7>
            Scanner sc = new Scanner(System.in);
            String str = "";
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            boolean flag = verifyString(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入数据不合法，请重新输入");
            }
        }
        //2、转换
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(stringToLuoMa(c));
        }
        //3、输出结果
        System.out.println(sb);
    }

    //switch可以用字符型判断，上面不需要数据类型转换
    public static String stringToLuoMa(char number) {
        String str = switch (number) {
            //注：
            //case后面要为char类型的字符，才可以做判断
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> str = "";
        };
        return str;
    }

    //验证字符串方法
    public static boolean verifyString(String str) {
        //要求1：长度为小于等于9
        //要求2：只能是数字
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
