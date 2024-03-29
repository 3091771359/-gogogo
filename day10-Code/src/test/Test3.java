package test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容

        //1.键盘输入任意字符串
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = input.next();


        //2.打乱里面的内容
        //修改字符串里面的内容：
        //1.subString
        //2.变成字符数组
        char[] array = str.toCharArray();

        //3.打乱数组里面的内容
        //从0索引开始，跟一个随机索引进行位置的交换
        //当数组里面的每一个元素都跟一个随机索引进行交换完毕之后，那么内容就打乱了
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            char temp = array[i];
            array[i] = array[index];
            array[index] =  temp;
        }
        //4.把字符数组再变回字符串
        String result = new String(array);
        System.out.println(result);
    }
}