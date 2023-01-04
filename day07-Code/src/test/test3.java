package test;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        /*   需求：
            定义方法实现随机产生一个5位的验证码
            验证码格式：
            长度为5
            前四位是大写字母或者小写字母
            最后一位是数字
     */
        //可以先把52个大小写字母放在一个数组中
        //在通过随机抽取数组索引的方法获取随机字符
        //1.把字符存放在数组中
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            //根据ASSIC码表类型转换分别存大小写字母
            //0~25刚好为26位
            if (i <= 25) {//小写只有26个
                chars[i] = (char) (97 + i);
            } else {//大于26时存放大写字母
                //不能直接加i因为i现在等于26，需要再减去一个26，才可以实现加1的效果
                chars[i] = (char) (65 + i - 26);
            }
        }
        //2.随机抽取4次
        //随机抽取数组中的索引
        Random r = new Random();
        //范围：整个数组中随机抽取4位索引
        //定义一个变量用来接受最终结果
        String result = "";
        //不赋予任何值，留作拼接
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chars.length);
            //打印抽取的随机索引的值
            //System.out.println(chars[randomIndex]);
            result = result + chars[randomIndex];
        }
        //System.out.println(result);
        //3.随机生成一个数字
        int number = r.nextInt(10);
        //4.生成最终的结果
        result = result + number;
        System.out.println(result);
    }
}
