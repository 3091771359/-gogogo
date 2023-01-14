package test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
       /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        规则：
        长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。*/


        //1.可以把所有的大写字母，小写字母都放到一个数组当中
        char[] chars = new char[52];
        //a-z  A-Z
        for (int i = 0; i < chars.length; i++) {
            if (i <= 25) {
                chars[i] = (char) ('a' + i);
            } else {
                //过来过去等于+1
                chars[i] = (char) ('A' + i - 26);
            }
        }

        //2.从数组中随机获取4次
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(chars.length);
            sb.append(chars[index]);
        }

        //3.生成一个0~9之间的随机数拼接到最后
        int number = r.nextInt(9);
        String str = sb.append(number).toString();

        //4、打乱字符数组中的值
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            int index = r.nextInt(chs.length);
            char temp = chs[i];
            chs[i] = chs[index];
            chs[index] = temp;
        }
        //5、将字符数组再变回字符串
        String result = new String(chs);

        //6、输出打印
        System.out.println(result);
    }
}