package stringDemo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        String result = rollback(str);
        System.out.println(result);
    }

    //1.我要干什么---字符串反转
    //2.干这件事，需要什么---需要一个字符串
    //3.需不需要返回值---需要返回一个字符串
    public static String rollback(String str) {
        String result = "";
        //反转---就是倒着遍历
        for (int i = str.length() - 1; i >= 0; i--) {
            //把每一个元素取出来
            char c = str.charAt(i);
            //将取出来的元素拼接在一起
            result += c;
        }
        //返回最终结果
        return result;
    }
}
