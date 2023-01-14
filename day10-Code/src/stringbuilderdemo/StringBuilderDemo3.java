package stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //使用StringBuilder的场景
        //1、字符串的拼接
        //2、字符串的反转

        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //调用StringBuilder
        String result = new StringBuilder().append(str).reverse().toString();

        //对字符串做判断的
        if (result.equals(str)) {
            System.out.println("是一个对称字符串");
        } else {
            System.out.println("不是一个对称字符串");
        }
    }
}
