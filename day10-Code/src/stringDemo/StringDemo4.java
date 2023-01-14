package stringDemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //遍历字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //遍历
        for (int i = 0; i < str.length(); i++) {
            //获取下标元素方法
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
