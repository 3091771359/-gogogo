package test;

import java.util.Scanner;

public class Test1Case1 {
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
        //1、键盘录入
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            //2、定义方法对录入的数据进行校验
            boolean flag = verifyString(str);
            if (flag) {
                //合法的
                break;
            } else {
                //不合法的
                System.out.println("输入的数据不合法，请重新输入");
            }
        }
        //3、定义方法，进行相应的转换
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //类型转换
            int number = c - 48;
            //直接把方法的返回值交给StringBuilder处理
            result = sb.append(stringTOLuoMa(number)).toString();
        }
        System.out.println(result);
    }

    public static String stringTOLuoMa(int number) {
        //罗马数字里面是没有0的
        //如果键盘录入的数字包含0，可以变成""(长度为0的字符串)
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ",};
        //直接返回对应的值
        return arr[number];
    }

    public static boolean verifyString(String str) {
        //要求1：长度为小于等于9

        if (str.length() > 9) {
            return false;
        }
        //要求2：只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //这里是字符
            //用||是因为，满足一个就可以了
            if (c < '0' || c > '9') {
                //不合法
                return false;
            }
        }
        //只有把每一个字符都判断完毕，都合法才会返回true
        return true;
    }
}
