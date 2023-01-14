package stringDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //遍历字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //统计---计数器思想
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            //获取下标元素方法
            char c = str.charAt(i);
            //对每一个元素进行判断
            if (c >= 'a' && c <= 'z') {
                //小写字符++
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                //大写字符++
                bigCount++;
                //对字符进行判断，用引号
            } else if (c >= '0' && c <= '9') {
                //数字字符++
                numberCount++;
            }
        }
        //打印统计结果
        System.out.println("=================================");
        System.out.println("大写字符有" + bigCount + "个");
        System.out.println("小写字符有" + smallCount + "个");
        System.out.println("数字字符有" + numberCount + "个");
    }
}
